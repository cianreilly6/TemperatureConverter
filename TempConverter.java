import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        System.out.println("Welcome to the Temperature Converter!");
        
        while (continueConversion) {
            System.out.println("\nSelect the conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Thank you for using the Temperature Converter. Goodbye!");
                break;
            }

            System.out.print("Enter the temperature to convert: ");
            double inputTemperature = scanner.nextDouble();
            double convertedTemperature;

            switch (choice) {
                case 1: // Celsius to Fahrenheit
                    convertedTemperature = (inputTemperature * 9/5) + 32;
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", inputTemperature, convertedTemperature);
                    break;

                case 2: // Celsius to Kelvin
                    convertedTemperature = inputTemperature + 273.15;
                    System.out.printf("%.2f Celsius is %.2f Kelvin%n", inputTemperature, convertedTemperature);
                    break;

                case 3: // Fahrenheit to Celsius
                    convertedTemperature = (inputTemperature - 32) * 5/9;
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", inputTemperature, convertedTemperature);
                    break;

                case 4: // Fahrenheit to Kelvin
                    convertedTemperature = (inputTemperature - 32) * 5/9 + 273.15;
                    System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", inputTemperature, convertedTemperature);
                    break;

                case 5: // Kelvin to Celsius
                    convertedTemperature = inputTemperature - 273.15;
                    System.out.printf("%.2f Kelvin is %.2f Celsius%n", inputTemperature, convertedTemperature);
                    break;

                case 6: // Kelvin to Fahrenheit
                    convertedTemperature = (inputTemperature - 273.15) * 9/5 + 32;
                    System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", inputTemperature, convertedTemperature);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.print("\nDo you want to perform another conversion? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                continueConversion = false;
                System.out.println("Thank you for using the Temperature Converter. Goodbye!");
            }
        }

        scanner.close();
    }
}
