

// 
prompt the user to input age's of the father and son.
store the numbers in two separate variables.
initialize anonther variable "diff" and assign the value to zero.
initialize anonther variable "twice" and assign the value to diff.
initialize anonther variable "year" and assign the value to zero.
 store the difference between the age of the father and son.
Check if the father was twice the age of the son or when he will be twice the son's age and if he currently twice the age.
print out the result of the check.


import java.util.Scanner;
public class DoubleAge{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
  
  System.out.print("Enter the father's ages(1-80): ");
  int father = input.nextInt();

System.out.print("Enter the son's ages(1-80): ");
  int son = input.nextInt();

int diff = 0;
int twice = diff;
int year = 0;


diff = father - son;

year = son - twice;

if (son > twice){
System.out.print(" The father was twice as old as his son" + year + "years ago");

}

else if (son < twice){
System.out.print(" The father will be twice as old as his son in" + year + "years time");

}

else {
	System.out.println(" The father is currently twice as old as his son");

}



}



}