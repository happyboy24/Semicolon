/*ask the user to enter a number.
store this value in a variable called number.
check the number if number is 0:
print "zero".
else if number is greater than 0:
if number is divisible by 2 (the remainder of number divided by 2 is 0):
print number followed by " is a positive even number".
else (it's not even):
print number followed by " is a positive odd number".
else if number is less than 0:
if number is divisible by 2 (the remainder of number divided by 2 is 0):
print number followed by " is a negative even number".
else (it's not even):
print number followed by " is a negative odd number".
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