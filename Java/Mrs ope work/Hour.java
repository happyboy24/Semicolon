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