/*​Ask the user to enter their grade (a-f).
​Store the input in a variable called grade.
​Check the grade:
​If grade is "a" or grade is "b" or grade is "c" or grade is "d":
​Print "Pass".
​Else if grade is "f":
​Print "Failed".
​Else (if it's not any of the above):
​Print "invalid".
​*\


import java.util.Scanner;
 public class Grade{
  public static void main(String[]args){
 Scanner input = new Scanner(System.in);
  System.out.print("Enter your grade(a-f):" );
String letter = input.nextLine();

if(letter.equals ("a")){
System.out.print("Pass");
}
if(letter.equals ("b")){
System.out.print("Pass");
}
if(letter.equals ("c")){
System.out.print("Pass");
}
if(letter.equals ("d")){
System.out.print("Pass");
}

if(letter.equals ("f")){
 System.out.print("Failed");
}
else {
System.out.print("invalid");
}

}
}

