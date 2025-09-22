import java.util.Scanner;
import java.util.Random;

public class ModifyRock {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        while (Math.abs(userScore - computerScore) < 3) {
            
            System.out.print("Enter your choice (0 for Scissor, 1 for Rock, 2 for Paper): ");
            int userChoice = input.nextInt();
            
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue; 
            }

            int computerChoice = random.nextInt(3);

            String[] choices = {"Scissor", "Rock", "Paper"};
            System.out.println("The computer's choice is " + choices[computerChoice] + ".");

            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) || 
                       (userChoice == 1 && computerChoice == 0) || 
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }
            
            System.out.println("Current score: You " + userScore + " - " + computerScore + " Computer");
            System.out.println("");
        }

        if (userScore > computerScore) {
            System.out.println("Congratulations! You are the final winner! 🏆");
        } else {
            System.out.println("The computer is the final winner. Better luck next time! 🤖");
        }

        input.close();
    }
}