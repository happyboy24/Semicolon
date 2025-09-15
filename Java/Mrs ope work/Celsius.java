​/*Declare a Scanner object for user input.
Display a message to the user: "Enter the temp:".
Read the integer input from the user and store it in a variable called temp.
​Check if temp is greater than 25.
If true, display the word "Hot".
​Check if temp is between 16 and 25 (inclusive).
If true, display the word "Warm".
​Check if temp is between 0 and 15 (inclusive).
If true, display the word "Cold".
​Check if temp is between -1 and 0 (inclusive).
If true, display the word "Freezing".
​End*\

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