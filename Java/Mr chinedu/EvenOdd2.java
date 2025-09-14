/*​​Ask the user to enter a number.
​Store this value in a variable called number.
​Check the number:
​If number is 0:
​Print "Zero".
​Else if number is greater than 0:
​If number is divisible by 2 (the remainder of number divided by 2 is 0):
​Print number followed by " is a Positive even number".
​Else (it's not even):
​Print number followed by " is a Positive odd number".
​Else if number is less than 0:
​If number is divisible by 2 (the remainder of number divided by 2 is 0):
​Print number followed by " is a Negative even number".
​Else (it's not even):
​Print number followed by " is a Negative odd number".
​*\




import java.util.Scanner;
 public class EvenOdd2{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);
 System.out.print(" Enter a number:");
  int number = input.nextInt();

if(number %2 == 0){
System.out.print(number + "is a Postive even number");
}
 else if(number %2 != 0) {
System.out.println(number + "is a Postive odd number");
}

if(number %2 == 0 && number < 0){
System.out.println(number + "is a Negative even number");
}

if(number %2 != 0 && number < 0 ) {
System.out.println(number + "is a Negative odd number");
}

 else if
(number %2 == 0|| number %2 != 0 || number %2 == 0 && number < 0 || number %2 != 0 && number < 0);
 System.out.println("Zero");
}


}

}