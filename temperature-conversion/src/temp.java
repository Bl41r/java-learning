import java.util.Scanner;

public class temp {
	
	public static double convertCtoF(double temperature) {
		return temperature  * (9.0 / 5) + 32;
	}
	
	public static double convertFtoC(double temperature) {
		return (temperature - 32) * (5.0 / 9);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection = 0;

		while (selection > 2 || selection < 1) {
			System.out.println("1) Celsius to Fahrenheit");
			System.out.println("2) Fahrenheit to Celsius");
			selection = scanner.nextInt();
		}
		
		double temperature;
		if (selection == 1) {
			System.out.println("Temperature in Celsius to convert?");
			
			do {
				try {
					String t = scanner.next();
					temperature = Double.parseDouble(t);
					System.out.println(convertCtoF(temperature));
					break;
				
				} catch (Exception e) {
					System.out.println("Could not parse input, try again.");
				}
			
			} while (true);

		} else {
			System.out.println("Temperature in Fahrenheit to convert?");
			
			do {
				try{
					String t = scanner.next();
					temperature = Double.parseDouble(t);
					System.out.println(convertFtoC(temperature));
					break;
				
				} catch (Exception e) {
					System.out.println("Could not parse input, try again.");
				}
			
			} while (true);
		}
	}
}
