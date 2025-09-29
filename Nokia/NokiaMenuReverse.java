import java.util.Scanner;

public class NokiaMenuReverse {
public static void main(String[] args) {

    String userprompt = """
           Welcome to Nokia
            Menu:
            1 -> Phone book
            2 -> Messages
            3 -> Chat
            4 -> Call register
            5 -> Tones
            6 -> Settings
            7 -> Call divert
            8 -> Games
            9 -> Calculator
            10 -> Reminders
            11 -> Clock
            12 -> Profiles
            13 -> Sim services
            14 -> Exit
            """;

    
        Scanner input = new Scanner(System.in);
         int user = input.nextInt();

        do {
            System.out.println(String userprompt);
            System.out.print("Enter your choice: ");

                  if (userChoice == 14) {
                    System.out.println("Thank you for using the Nokia Menu. Goodbye!");
                    break;
                }

            switch (userChoice) {
                    case 1 -> phoneBookMenu(input);
                    case 2 -> messagesMenu(input);
                    case 3 -> System.out.println("Start Chat selected");
                    case 4 -> callRegisterMenu(input);
                    case 5 -> tonesMenu(input);
                    case 6 -> settingsMenu(input);
                    case 7 -> System.out.println("Call divert selected");
                    case 8 -> System.out.println("Games selected");
                    case 9 -> System.out.println("Calculator selected");
                    case 10 -> System.out.println("Reminders selected");
                    case 11 -> clockMenu(input);
                    case 12 -> System.out.println("Profiles selected");
                    case 13 -> System.out.println("SIM services selected");
                    
                }

                System.out.println("\n--- Press Enter to return to the Main Menu ---\n");
                input.nextLine(); 

            } 
else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); 
                userChoice = -1; 
            }


        } while (userChoice != 14);          
    }

   

           int phoneBookChoice = -1;
       
 do {
            String phoneBookPrompt = """
               Phone book:
                1 -> Search
                2 -> Service Nos
                3 -> Add Name
                4 -> Erase
                5 -> Edit
                6 -> Assign tone
                7 -> Send b'card
                8 -> Options
                9 -> Speed dials
                10 -> Voice tags
                0 -> Back to Main Menu
                """;
            System.out.println(phoneBookPrompt);
            System.out.print("Enter your choice: ");

            
                if (phoneBookChoice == 0) {
                    System.out.println("Returning to Main Menu...");
                    
                }

                switch (phoneBookChoice) {
                    case 1 -> System.out.println("Search selected");
                    case 2 -> System.out.println("Service Nos selected");
                    case 3 -> System.out.println("Add Name selected");
                    case 4 -> System.out.println("Erase selected");
                    case 5 -> System.out.println("Edit selected");
                    case 6 -> System.out.println("Assign tone selected");
                    case 7 -> System.out.println("Send b'card selected");
                    case 8 -> phoneBookOptionsMenu(input);
                    case 9 -> System.out.println("Speed dials selected");
                    case 10 -> System.out.println("Voice tags selected");
                                    }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); 
            }

                        if (phoneBookChoice != 0) {
                System.out.println("\n--- Press Enter to return to Phone book menu ---\n");
                input.nextLine();
            }

        } while (phoneBookChoice != 0);
    }

    
        int optionChoice = -1;
        do {
            String optionprompt = """
                Option:
                 1 -> Type of view
                 2 -> Memory status
                 0 -> Back to Phone book
                """;
            System.out.println(optionprompt);
            System.out.print("Enter your choice: ");

            
                if (optionChoice == 0) {
                    System.out.println("Returning to Phone book...");
                    return;
                }

                switch (optionChoice) {
                    case 1 -> System.out.println("Type of view selected");
                    case 2 -> System.out.println("Memory status selected");
                                   }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (optionChoice != 0) {
                System.out.println("\n--- Press Enter to return to Options menu ---\n");
                input.nextLine();
            }

        } while (optionChoice != 0);
    }

    
        int messageChoice = -1;
        do {
            String messagesPrompt = """
               Messages:
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture messages
                5 -> Templates
                6 -> Smileys
                7 -> Message Settings
                8 -> Info service
                9 -> Voice mailbox number
                10 -> Service command editor
                0 -> Back to Main Menu
                """;
            System.out.println(messagesPrompt);
            System.out.print("Enter your choice: ");

            
                if (messageChoice == 0) {
                    System.out.println("Returning to Main Menu...");
                    return;
                }

                switch (messageChoice) {
                    case 1 -> System.out.println("Write messages selected");
                    case 2 -> System.out.println("Inbox selected");
                    case 3 -> System.out.println("Outbox selected");
                    case 4 -> System.out.println("Picture messages selected");
                    case 5 -> System.out.println("Templates selected");
                    case 6 -> System.out.println("Smileys selected");
                    case 7 -> messageSettingsMenu(input);
                    case 8 -> System.out.println("Info service selected");
                    case 9 -> System.out.println("Voice mailbox number selected");
                    case 10 -> System.out.println("Service command editor selected");
                    
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (messageChoice != 0) {
                System.out.println("\n--- Press Enter to return to Messages menu ---\n");
                input.nextLine();
            }

        } while (messageChoice != 0);
    }

    
        int settingsChoice = -1;
        do {
            String settingsPrompt = """
               Message Settings:
                1 -> Set
                2 -> Common
                0 -> Back to Messages
                """;
            System.out.println(settingsPrompt);
            System.out.print("Enter your choice: ");

            
                if (settingsChoice == 0) {
                    System.out.println("Returning to Messages...");
                    return;
                }

                switch (settingsChoice) {
                    case 1 -> messageSettingsSetMenu(input);
                    case 2 -> messageSettingsCommonMenu(input);
                    
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (settingsChoice != 0) {
                System.out.println("\n--- Press Enter to return to Message Settings menu ---\n");
                input.nextLine();
            }

        } while (settingsChoice != 0);
    }


     int setChoice = -1;
        do {
            String setPrompt = """
               Set:
                1 -> Message centre number
                2 -> Messages sent as
                3 -> Message validity
                0 -> Back to Message Settings
                """;
            System.out.println(setPrompt);
            System.out.print("Enter your choice: ");

            
                if (setChoice == 0) {
                    System.out.println("Returning to Message Settings...");
                    return;
                }

                switch (setChoice) {
                    case 1 -> System.out.println("Message centre number selected");
                    case 2 -> System.out.println("Messages sent as selected");
                    case 3 -> System.out.println("Message validity selected");
                    
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (setChoice != 0) {
                System.out.println("\n--- Press Enter to return to Set menu ---\n");
                input.nextLine();
            }

        } while (setChoice != 0);
    }

    

        int commonChoice = -1;
        do {
            String commonPrompt = """
               Common:
                1 -> Delivery reports
                2 -> Reply via same centre
                3 -> Character support
                0 -> Back to Message Settings
                """;
            System.out.println(commonPrompt);
            System.out.print("Enter your choice: ");

           
                if (commonChoice == 0) {
                    System.out.println("Returning to Message Settings...");
                    return;
                }

                switch (commonChoice) {
                    case 1 -> System.out.println("Delivery reports selected");
                    case 2 -> System.out.println("Reply via same centre selected");
                    case 3 -> System.out.println("Character support selected");
                    
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (commonChoice != 0) {
                System.out.println("\n--- Press Enter to return to Common menu ---\n");
                input.nextLine();
            }

        } while (commonChoice != 0);
    }

    
        int callRegisterChoice = -1;
        do {
            String callRegisterPrompt = """
               Call register:
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call lists
                5 -> Show call duration
                6 -> Show call cost
                7 -> Call cost setting
                8 -> Prepaid
                0 -> Back to Main Menu
                """;
            System.out.println(callRegisterPrompt);
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                callRegisterChoice = input.nextInt();
                input.nextLine();

                if (callRegisterChoice == 0) {
                    System.out.println("Returning to Main Menu...");
                    return;
                }

                switch (callRegisterChoice) {
                    case 1 -> System.out.println("Missed calls selected");
                    case 2 -> System.out.println("Recieved calls selected");
                    case 3 -> System.out.println("Dialled numbers selected");
                    case 4 -> System.out.println("Erase recent call lists selected");
                    case 5 -> showCallDurationMenu(input);
                    case 6 -> showCallCostMenu(input);
                    case 7 -> callCostSettingsMenu(input);
                    case 8 -> System.out.println("Prepaid credit selected");
                   
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (callRegisterChoice != 0) {
                System.out.println("\n--- Press Enter to return to Call Register menu ---\n");
                input.nextLine();
            }

        } while (callRegisterChoice != 0);
    }

    
        int showCallDurationChoice = -1;
        do {
            String showCallDurationPrompt = """
                Show Call Duration
                1 -> Last call duration
                2 -> All call's duration
                3 -> Received call's duration
                4 -> Dialled call's duration
                5 -> Clear timers
                0 -> Back to Call Register
                """;
            System.out.println(showCallDurationPrompt);
            System.out.print("Enter your choice: ");

           
                if (showCallDurationChoice == 0) {
                    System.out.println("Returning to Call Register...");
                    return;
                }

                switch (showCallDurationChoice) {
                    case 1 -> System.out.println("Last call duration selected");
                    case 2 -> System.out.println("All call's duration selected");
                    case 3 -> System.out.println("Received call's duration selected");
                    case 4 -> System.out.println("Dialled call's duration selected");
                    case 5 -> System.out.println("Clear timers selected");
                 
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (showCallDurationChoice != 0) {
                System.out.println("\n--- Press Enter to return to Show Call Duration menu ---\n");
                input.nextLine();
            }

        } while (showCallDurationChoice != 0);
    }

     
        int showCallCostChoice = -1;
        do {
            String showCallCostPrompt = """
                Show Call Cost
                1 -> Last call cost
                2 -> All call's cost
                3 -> Clear counters
                0 -> Back to Call Register
                """;
            System.out.println(showCallCostPrompt);
            System.out.print("Enter your choice: ");

           
                if (showCallCostChoice == 0) {
                    System.out.println("Returning to Call Register...");
                    
                }

                switch (showCallCostChoice) {
                    case 1 -> System.out.println("Last call cost selected");
                    case 2 -> System.out.println("All call's cost selected");
                    case 3 -> System.out.println("Clear counters selected");
                     Cost selection.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (showCallCostChoice != 0) {
                System.out.println("\n--- Press Enter to return to Show Call Cost menu ---\n");
                input.nextLine();
            }

        } while (showCallCostChoice != 0);
    }

    int callCostSettingsChoice = -1;
        do {
            String callCostSettingsPrompt = """
                Call Cost Setting
                1 -> Call cost limit
                2 -> Show costs in
                0 -> Back to Call Register
                """;
            System.out.println(callCostSettingsPrompt);
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                callCostSettingsChoice = input.nextInt();
                input.nextLine();

                if (callCostSettingsChoice == 0) {
                    System.out.println("Returning to Call Register...");
                    return;
                }

                switch (callCostSettingsChoice) {
                    case 1 -> System.out.println("Call cost limit selected");
                    case 2 -> System.out.println("Show costs in selected");
                    
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }

            if (callCostSettingsChoice != 0) {
                System.out.println("\n--- Press Enter to return to Call Cost Setting menu ---\n");
                input.nextLine();
            }

        } while (callCostSettingsChoice != 0);
    }

    