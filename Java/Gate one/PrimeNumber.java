import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } 
	else {
        for (int a = 2; a <= number / 2; a++) {

        if (number % a == 0) {

        isPrime = false;

        break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } 
	else {
            System.out.println(number + " is not a prime number.");
        }
    }
}