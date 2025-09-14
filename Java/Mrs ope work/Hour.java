/*Ask the user to enter the number of hours they worked.
Store this value in a variable called hoursWorked.
Ask the user to enter their hourly rate.
Store this value in a variable called hourlyRate.
Calculate total pay:
Check for overtime:
If hoursWorked is greater than 40:
Calculate the regular pay by multiplying 40 by hourlyRate.
Calculate the number of overtime hours by subtracting 40 from hoursWorked.
Calculate the overtime pay by multiplying the overtimeHours by hourlyRate and then by 1.5.
The totalPay is the sum of the regularPay and overtimePay.
Otherwise (no overtime):
The totalPay is simply hoursWorked multiplied by hourlyRate.
Display the result:
Print the final totalPay to the user, formatted to two decimal places.
*\

import java.util.Scanner;

public class Hour {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of hours worked: ");
       
        double hoursWorked = input.nextDouble();

       
        System.out.print("Enter the hourly rate: ");
       
        double hourlyRate = input.nextDouble();
    
        double totalPay;

        
        if (hoursWorked > 40) {
            
            double regularPay = 40 * hourlyRate;

            double overtimeHours = hoursWorked - 40;
            
            double overtimePay = overtimeHours * (hourlyRate * 1.5);

            totalPay = regularPay + overtimePay;
        } else {
            totalPay = hoursWorked * hourlyRate;
        }

        System.out.printf("Total pay: $%.2f%n", totalPay);
    }
}