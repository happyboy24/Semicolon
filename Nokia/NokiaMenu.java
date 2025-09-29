import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {
        String prompt = """
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
            """;
        System.out.println(prompt);

        Scanner input = new Scanner(System.in);
          int user = input.nextInt();
        switch (user) {
            case 1 -> {
                
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
                    """;
                System.out.println(phoneBookPrompt);
                int phoneBookChoice = input.nextInt();

                switch (phoneBookChoice) {
                    case 1 -> System.out.println("Search selected");
                    case 2 -> System.out.println("Service Nos selected");
                    case 3 -> System.out.println("Add Name selected");
                    case 4 -> System.out.println("Erase selected");
                    case 5 -> System.out.println("Edit selected");
                    case 6 -> System.out.println("Assign tone selected");
                    case 7 -> System.out.println("Send b'card selected");
                    case 8 -> {
                        String optionprompt = """
                            Option:
                             1 -> Type of view
                             2 -> Memory status
                            """;
                        System.out.println(optionprompt);
                        int optionChoice = input.nextInt();
                        switch (optionChoice) {
                            case 1 -> System.out.println("Type of view selected");
                            case 2 -> System.out.println("Memory status selected");
                          
                        }
                    }
                    case 9 -> System.out.println("Speed dials selected");
                    case 10 -> System.out.println("Voice tags selected");
                   
                }
            }
            case 2 -> {
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
                    """;
                System.out.println(messagesPrompt);
                int messageChoice = input.nextInt();

                switch (messageChoice) {
                    case 1 -> System.out.println("Write messages selected");
                    case 2 -> System.out.println("Inbox selected");
                    case 3 -> System.out.println("Outbox selected");
                    case 4 -> System.out.println("Picture messages selected");
                    case 5 -> System.out.println("Templates selected");
                    case 6 -> System.out.println("Smileys selected");

                    case 7 -> {
                        String settingsPrompt = """
                           Message Settings:
                            1 -> Set
                            2 -> Common
                            """;
                        System.out.println(settingsPrompt);
                        int settingsChoice = input.nextInt();

                        switch (settingsChoice) {
                            case 1 -> {
                                String setPrompt = """
                                   Set:
                                    1 -> Message centre number
                                    2 -> Messages sent as
                                    3 -> Message validity
                                    """;
                                System.out.println(setPrompt);
                                int setChoice = input.nextInt();
                                switch (setChoice) {
                                    case 1 -> System.out.println("Message centre number selected");
                                    case 2 -> System.out.println("Messages sent as selected");
                                    case 3 -> System.out.println("Message validity selected");
                                   
                                }
                            }
                            case 2 -> {
                                String commonPrompt = """
                                   Common:
                                    1 -> Delivery reports
                                    2 -> Reply via same centre
                                    3 -> Character support
                                    """;
                                System.out.println(commonPrompt);
                                int commonChoice = input.nextInt();
                                switch (commonChoice) {
                                    case 1 -> System.out.println("Delivery reports selected");
                                    case 2 -> System.out.println("Reply via same centre selected");
                                    case 3 -> System.out.println("Character support selected");
                                    
                                }
                            }
                            
                        }
                    }
                    case 8 -> System.out.println("Info service selected");
                    case 9 -> System.out.println("Voice mailbox number selected");
                    case 10 -> System.out.println("Service command editor selected");
                   
                }
            }

            case 3 -> System.out.println("Start Chat selected");

          
            case 4 -> {
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
                    """;
                System.out.println(callRegisterPrompt);
                int callRegisterChoice = input.nextInt();

                switch (callRegisterChoice) {
                    case 1 -> System.out.println("Missed calls selected");
                    case 2 -> System.out.println("Recieved calls selected");
                    case 3 -> System.out.println("Dialled numbers selected");
                    case 4 -> System.out.println("Erase recent call lists selected");
                    case 5 -> {
                        String showCallDurationPrompt = """
                            Show Call Duration
                            1 -> Last call duration
                            2 -> All call's duration
                            3 -> Received call's duration
                            4 -> Dialled call's duration
                            5 -> Clear timers
                            """;
                        System.out.println(showCallDurationPrompt);
                        int showCallDurationChoice = input.nextInt();
                        switch (showCallDurationChoice) {
                            case 1 -> System.out.println("Last call duration selected");
                            case 2 -> System.out.println("All call's duration selected");
                            case 3 -> System.out.println("Received call's duration selected");
                            case 4 -> System.out.println("Dialled call's duration selected");
                            case 5 -> System.out.println("Clear timers selected");
                            
                        }
                    }
                    case 6 -> {
                        String showCallCostPrompt = """
                            Show Call Cost
                            1 -> Last call cost
                            2 -> All call's cost
                            3 -> Clear counters
                            """;
                        System.out.println(showCallCostPrompt);
                        int showCallCostChoice = input.nextInt();
                        switch (showCallCostChoice) {
                            case 1 -> System.out.println("Last call cost selected");
                            case 2 -> System.out.println("All call's cost selected");
                            case 3 -> System.out.println("Clear counters selected");
                            
                        }
                    }
                    case 7 -> {
                        String callCostSettingsPrompt = """
                            Call Cost Setting
                            1 -> Call cost limit
                            2 -> Show costs in
                            """;
                        System.out.println(callCostSettingsPrompt);
                        int callCostSettingsChoice = input.nextInt();
                        switch (callCostSettingsChoice) {
                            case 1 -> System.out.println("Call cost limit selected");
                            case 2 -> System.out.println("Show costs in selected");
                          
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit selected");
                    
                }
            }

            case 5 -> {
                String tonesPrompt = """
                   Tones:
                    1 -> Ringing tone
                    2 -> Ringing volume
                    3 -> Incoming call alert
                    4 -> Composer
                    5 -> Message alert tone
                    6 -> Keypad tones
                    7 -> Warning and game tones
                    8 -> Vibrating alert
                    9 -> Screen saver
                    """;
                System.out.println(tonesPrompt);
                int tonesChoice = input.nextInt();

                switch (tonesChoice) {
                    case 1 -> System.out.println("Ringing tone selected");
                    case 2 -> System.out.println("Ringing volume selected");
                    case 3 -> System.out.println("Incoming call alert selected");
                    case 4 -> System.out.println("Composer selected");
                    case 5 -> System.out.println("Message alert tone selected");
                    case 6 -> System.out.println("Keypad tones selected");
                    case 7 -> System.out.println("Warning and game tones selected");
                    case 8 -> System.out.println("Vibrating alert selected");
                    case 9 -> System.out.println("Screen saver selected");
                   
                }
            }

            case 6 -> {
                String settingsPrompt = """
                   Settings:
                    1 -> Call settings
                    2 -> Phone settings
                    3 -> Security settings
                    4 -> Restore factory settings
                    """;
                System.out.println(settingsPrompt);
                int settingsChoice = input.nextInt(); 

                switch (settingsChoice) {
                    case 1 -> {
                        String callSettingsPrompt = """
                           Call Settings:
                            1 -> Automatic redial
                            2 -> Speed dialling
                            3 -> Call waiting option
                            4 -> Own number sending
                            5 -> Phone line in use
                            6 -> Automatic answer
                            """;
                        System.out.println(callSettingsPrompt);
                        int callSettingsChoice = input.nextInt();

                        switch (callSettingsChoice) {
                            case 1 -> System.out.println("Automatic redial selected");
                            case 2 -> System.out.println("Speed dialing selected");
                            case 3 -> System.out.println("Call waiting selected");
                            case 4 -> System.out.println("Own number sending selected");
                            case 5 -> System.out.println("Phone line in use selected");
                            case 6 -> System.out.println("Automatic answer selected");
                           
                        }
                    }
                    case 2 -> {
                        String phoneSettingsPrompt = """
                            Phone Settings:
                            1 -> Language
                            2 -> Cell info display
                            3 -> Welcome note
                            4 -> Network selection
                            5 -> Lights
                            6 -> Confirm SIM service actions
                            """;
                        System.out.println(phoneSettingsPrompt);
                        int phoneSettingsChoice = input.nextInt();

                        switch (phoneSettingsChoice) {
                            case 1 -> System.out.println("Language selected");
                            case 2 -> System.out.println("Cell info display selected");
                            case 3 -> System.out.println("Welcome note selected");
                            case 4 -> System.out.println("Network selection selected");
                            case 5 -> System.out.println("Lights selected");
                            case 6 -> System.out.println("Confirm SIM service actions selected");
                          
                        }
                    }
                    case 3 -> {
                        String securitySettingsPrompt = """
                           Security Settings:
                            1 -> PIN code request
                            2 -> Call barring service
                            3 -> Fixed dialling
                            4 -> Closed user group
                            5 -> Phone security
                            6 -> Change access codes
                            """;
                        System.out.println(securitySettingsPrompt);
                        int securitySettingsChoice = input.nextInt();

                        switch (securitySettingsChoice) {
                            case 1 -> System.out.println("PIN code request selected");
                            case 2 -> System.out.println("Call barring service selected");
                            case 3 -> System.out.println("Fixed dialling selected");
                            case 4 -> System.out.println("Closed user group selected");
                            case 5 -> System.out.println("Phone security selected");
                            case 6 -> System.out.println("Change access codes selected");
                            
                        }
                    }
                    case 4 -> System.out.println("Restore factory settings selected");
                  
                }
            }
            case 7 -> System.out.println("Call divert selected");
            case 8 -> System.out.println("Games selected");
            case 9 -> System.out.println("Calculator selected");
            case 10 -> System.out.println("Reminders selected");

            case 11 -> {
                
                String clockPrompt = """
                    Clock:
                    1 -> Alarm clock
                    2 -> Clock settings
                    3 -> Date setting
                    4 -> Stopwatch
                    5 -> Countdown timer
                    6 -> Auto update of date and time
                    """;
                System.out.println(clockPrompt);
                int clockChoice = input.nextInt();
                switch (clockChoice) {
                    case 1 -> System.out.println("Alarm clock selected");
                    case 2 -> System.out.println("Clock settings selected");
                    case 3 -> System.out.println("Date setting selected");
                    case 4 -> System.out.println("Stopwatch selected");
                    case 5 -> System.out.println("Countdown timer selected");
                    case 6 -> System.out.println("Auto update of date and time selected");
                    
                }
            }

            case 12 -> System.out.println("Profiles selected");
            case 13 -> System.out.println("SIM services selected");
            default -> System.out.println("Invalid menu selection.");
     }
    }
}