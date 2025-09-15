import java.util.Scanner;
public class Total{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number:");
int total = input.nextInt();
int x = 1;
 total = 0;
 while (x <= 10) {
    total = total + 1;
    System.out.println(x);
 x++;
}

} 
}

//* there was no increment to x in the intial code given which made it an infinite loop*\\