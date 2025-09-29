import java.util.Scanner;
public class Error{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter your age:");
int age = input.nextInt();
if (age >= 65){
   System.out.println("Age is greater than or equal to 65");
}
 else {
   System.out.println("Age is less than 65");
}

} 
}


/* the code was without any calling braces and it has a bug *\