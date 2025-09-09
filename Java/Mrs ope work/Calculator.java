import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        String operator;
        double result = 0.0;
        boolean isValidOperation = true;

        System.out.println("Enter the first number:");
        number1 = scanner.nextDouble();

       
        scanner.nextLine();
       
        System.out.println("Enter an operator (+, -, *, /):");
        operator = scanner.nextLine();

        System.out.println("Enter the second number:");
        number2 = scanner.nextDouble();


        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
       
            if (number2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                isValidOperation = false;
            } else {
                result = number1 / number2;
            }
        } else {
         
            System.out.println("Error: Invalid operator.");
            isValidOperation = false;
        }

        if (isValidOperation) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}