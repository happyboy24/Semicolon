import java.util.Scanner;

public class RaisedToThePower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        int result = 1;

        if (exponent >= 0) {
            for (int i = 1; i <= exponent; i++) {

	result *= number;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        } 
	else {
        double fractResult = 1.0;
        for (int i = 1; i <= -exponent; i++) {
        fractResult /= number;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + fractResult);
        }

    }
}