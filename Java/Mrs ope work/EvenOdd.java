​/*Ask the user to enter a number.
​Store the number in a variable called number.
​Check if the number is even or odd:
​If number divided by 2 has a remainder of 0:
​Print a message stating that number is an even number.
​Else (if it doesn't have a remainder of 0):
​Print a message stating that number is an odd number.
​*\






import java.util.Scanner;
 public class EvenOdd{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);
 System.out.print(" Enter a number:");
  int number = input.nextInt();

if(number %2 == 0){
System.out.print(number + "is an even number");
}
 else if(number %2 != 0) {
System.out.print(number + "is an odd number");
}
 else {
 System.out.print("invalid");
}


}
}