import java.util.Scanner;
public class KataTest{
public static void main(String[]args){
 Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");
int number = input.nextInt();

System.out.println( " Is " + number  +   " a prime " +   Kata.isprime(number));
System.out.println("The factor of " + number + " Is " +   Kata.numberOfFactors(number));


}
}