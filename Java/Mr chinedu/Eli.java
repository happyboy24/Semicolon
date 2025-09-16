 /*ask the user to enter their attendance percentage.
store the value in a variable called percent.
ask the user to enter their average score.
store the value in a variable called score.
check eligibility:
if percent is greater than or equal to 75 and score is greater than or equal to 75:
print eligible.
else (if either condition is not met):
print not eligible.

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