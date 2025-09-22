import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        
        ch = Character.toLowerCase(ch);

        
        if (ch >= 'a' && ch <= 'z') {
           
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel. ");
            } else {
                System.out.println(ch + " is a consonant. ");
            }
        } else {
            System.out.println("Invalid input. Please enter a letter of the alphabet.");
        }

            }
}