/*display "enter your account balance:" to the user.
read the user's input and store it in a variable called balance.
check if balance is less than 100.
if true, display "low".
check if balance is greater than or equal to 100 and less than or equal to 1000.
if true, display "medium".
check if balance is greater than or equal to 1000.
if true, display "high".

*\


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
