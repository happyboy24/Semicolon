import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
       System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

       
        scanner.nextLine();
       
        System.out.println("Enter an operator (+, -, *, /):");
       String operator = scanner.nextLine();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        int result = 0;
        boolean isValidOperation = true;

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