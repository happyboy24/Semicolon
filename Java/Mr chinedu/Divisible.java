/*​​ask the user to enter a number.
store the number in a variable called number.
check for divisibility:
if number is divisible by 3 and number is divisible by 5:
print "is divisible by both 3 and 5".
else if number is divisible by 3:
print "is divisible by 3".
else if number is divisible by 5:
print "is divisible by 5".
else (if none of the above are true):
print "not divisible".

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
