/*Ask the user to enter their attendance percentage.
Store the value in a variable called percent.
Ask the user to enter their average score.
Store the value in a variable called score.
Check eligibility:
If percent is greater than or equal to 75 AND score is greater than or equal to 75:
Print Eligible.
Else (if either condition is not met):
Print Not Eligible.
*\




import java.util.Scanner;
 public class Eli{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);
System.out.print("Enter your attendance percentage:");
int percent = input.nextInt();
System.out.print("Enter your average score:");
int score = input.nextInt();

if(percent >= 75 && score >= 75){
System.out.print("Eligible");
}
else  {
 System.out.print("Not Eligible");
}

}
}