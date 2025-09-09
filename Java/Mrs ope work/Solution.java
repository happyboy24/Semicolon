
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

     
           
            System.out.print("Enter an integer: ");

        
            int number = input.nextInt();

            if ((number % 6 == 0) || (number % 7 == 0)) {
                          System.out.println("The given number is a multiple of 6 or a multiple of 7.");
            } else {
                
                System.out.println("The given number is neither a multiple of 6 nor a multiple of 7.");
            }
   
            System.out.println("Invalid input. Please enter a valid integer.");
    
        
    }
}