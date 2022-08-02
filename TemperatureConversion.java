import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("This is the program to convert the temperature");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C to get result in celsius or F to get the result in Fahrenheit");
        String s = sc.nextLine();

        if (s.equals("C")) {
            System.out.println("Enter the Fahrenheit value");
            int a = sc.nextInt();
            double celsius = (a - 32) / 1.8;
            System.out.println(a+" deg. Fahrenheit equals to "+celsius+" deg. Celsius");
            return;
        }
        else if (s.equals("F")) {
            System.out.println("Enter the Celsius value");
            int b = sc.nextInt();
            double fahrenheit = (b * 1.8) + 32;
            System.out.println(b+" deg. Celsius equals to "+fahrenheit+" deg. fahrenheit");
            return;
        }
        else {
            System.out.println("Entered input is invalid");
        }
    }
}
