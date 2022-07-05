import java.util.Scanner;
public class Nhietdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit:");
                    fahrenheit= input.nextDouble();
                    System.out.println("Fahrenheit to celcius: "+ fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celcius:");
                    celcius= input.nextDouble();
                    System.out.println("celcius to Fahrenheit: " + celciusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celciusToFahrenheit(double celcius){
        double fahrenheit=(9.0/5)*celcius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
        double celcius=(5.0/9)*(fahrenheit-32);
        return celcius;
    }
}
