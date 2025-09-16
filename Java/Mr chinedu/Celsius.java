​/*declare a scanner object for user input.
display a message to the user: "enter the temp:".
read the integer input from the user and store it in a variable called temp.
check if temp is greater than 25.
if true, display the word "hot".
check if temp is between 16 and 25 (inclusive).
if true, display the word "warm".
check if temp is between 0 and 15 (inclusive).
if true, display the word "cold".
check if temp is between -1 and 0 (inclusive).
if true, display the word "freezing".

​*\

import java.util.Scanner;
public class Celsius{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);

System.out.println("Enter the temp:");
int temp = input.nextInt();

if(temp > 25){
 	System.out.print("Hot");

 
  }
 if(temp>=16 && temp<=25){
 System.out.print("Warm");
} 
 if(temp >= 0 &&  temp<= 15){
 System.out.printf("Cold");
}
 if(temp >= -1 && temp <= 0){
 System.out.printf("Freezing");
}

}
}