/*DISPLAY "Enter your Account balance:" to the user.
READ the user's input and STORE it in a variable called balance.
CHECK if balance is less than 100.
If TRUE, DISPLAY "Low".
CHECK if balance is greater than or equal to 100 AND less than or equal to 1000.
If TRUE, DISPLAY "Medium".
CHECK if balance is greater than or equal to 1000.
If TRUE, DISPLAY "High".
END*\


import java.util.Scanner;
 public class Bank{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);
System.out.print("Enter your Account balance:");
int balance = input.nextInt();


if(balance < 100){
System.out.print("Low");
}
if(balance>=100 && balance<=1000)  {
 System.out.print("Medium");
}
if(balance >= 1000){
System.out.print("High");
}

}
}
