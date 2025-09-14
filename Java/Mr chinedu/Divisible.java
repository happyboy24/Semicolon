/*​​Ask the user to enter a number.
​Store the number in a variable called number.
​Check for divisibility:
​If number is divisible by 3 AND number is divisible by 5:
​Print "is divisible by both 3 and 5".
​Else if number is divisible by 3:
​Print "is divisible by 3".
​Else if number is divisible by 5:
​Print "is divisible by 5".
​Else (if none of the above are true):
​Print "not divisible".
*\
​




import java.util.Scanner;
 public class Divisible{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);
 System.out.print(" Enter a number:");
  int number = input.nextInt();

if(number %3 == 0 && number %5 == 0){
System.out.print("is divisible by both 3 and 5");
}
if(number %3 == 0){
 System.out.print("is divisible by 3");
}
if(number %5 == 0){
System.out.print("is divisible by 5");
}
else {
System.out.print("not divisible");
}

}
}
