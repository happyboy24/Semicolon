import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       
        Random random = new Random();

        
        System.out.print("Enter your choice (0 for Scissor, 1 for Rock, 2 for Paper): ");
        int userChoice = input.nextInt();

       
        int computerChoice = random.nextInt(3);

        
        String[] choices = {"Scissor", "Rock", "Paper"};
        System.out.println("The computer's choice is " + choices[computerChoice] + ".");

        
        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } 
        
        else if ((userChoice == 0 && computerChoice == 2) || 
                 (userChoice == 1 && computerChoice == 0) || 
                 (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } 
      
        else {
            System.out.println("You lose!");
        }

       
    }
}