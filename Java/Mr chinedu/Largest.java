/*Ask the user to enter the first number.
Store this value in a variable called num1.
Ask the user to enter the second number.
Store this value in a variable called num2.
Ask the user to enter the third number.
Store this value in a variable called num3.
Find the largest number:
Initialize a variable called largest with the value of num1.
If num2 is greater than largest, update largest to num2.
If num3 is greater than largest, update largest to num3.
Display the result:
Print a message showing the value of largest.
*\


import java.util.Scanner;
public class Largest{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);
 
  System.out.print("Enter a number1:");
  int num1 = input.nextInt();

 System.out.print("Enter a number2:");
  int num2 = input.nextInt();

 System.out.print("Enter a number3:");
  int num3 = input.nextInt();

         int largest = num1;
            if(num2 >= num1){
       largest = num2;
       
       }

     if(num3 >= num1){
      largest = num3;
}

System.out.print("The largest is " + largest);

}

}