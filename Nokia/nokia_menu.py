#def get_user_choice(prompt):
        #print(prompt)
   


#def nokia_menu():
    
    #user_prompt = """
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
"""

    user = get_user_choice(user_prompt)

    match user:
        case 1:
            phone_book_prompt = """
Phone book:
1 -> Search
2 -> Service Nos
3 -> Add Name
4 -> Erase
5 -> Edit
6 -> Assign tone
7 -> Send b card
8 -> Options
9 -> Speed dials
10 -> Voice tags
"""
            phone_book_choice = get_user_choice(phone_book_prompt)

            match phone_book_choice:
                case 1:
                    print("Search selected")
                case 2:
                    print("Service Nos selected")
                case 3:
                    print("Add Name selected")
                case 4:
                    print("Erase selected")
                case 5:
                    print("Edit selected")
                case 6:
                    print("Assign tone selected")
                case 7:
                    print("Send b'card selected")
                case 8:
                    option_prompt = """
Option:
1 -> Type of view
2 -> Memory status
"""
                    option_choice = get_user_choice(option_prompt)
                    match option_choice:
                        case 1:
                            print("Type of view selected")
                        case 2:
                            print("Memory status selected")
                        
                case 9:
                    print("Speed dials selected")
                case 10:
                    print("Voice tags selected")
               

        case 2:
            messages_prompt = """
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
"""
            message_choice = get_user_choice(messages_prompt)

            match message_choice:
                case 1:
                    print("Write messages selected")
                case 2:
                    print("Inbox selected")
                case 3:
                    print("Outbox selected")
                case 4:
                    print("Picture messages selected")
                case 5:
                    print("Templates selected")
                case 6:
                    print("Smileys selected")
                case 7:
                    settings_prompt = """
Message Settings:
1 -> Set
2 -> Common
"""
                    settings_choice = get_user_choice(settings_prompt)

                    match settings_choice:
                        case 1:
                            set_prompt = """
Set:
1 -> Message centre number
2 -> Messages sent as
3 -> Message validity
"""
                            set_choice = get_user_choice(set_prompt)
                            match set_choice:
                                case 1:
                                    print("Message centre number selected")
                                case 2:
                                    print("Messages sent as selected")
                                case 3:
                                    print("Message validity selected")
                                
                        case 2:
                            common_prompt = """
Common:
1 -> Delivery reports
2 -> Reply via same centre
3 -> Character support
"""
                            common_choice = get_user_choice(common_prompt)
                            match common_choice:
                                case 1:
                                    print("Delivery reports selected")
                                case 2:
                                    print("Reply via same centre selected")
                                case 3:
                                    print("Character support selected")
                                
                        
                case 8:
                    print("Info service selected")
                case 9:
                    print("Voice mailbox number selected")
                case 10:
                    print("Service command editor selected")
                
                    

        case 3:
            print("Start Chat selected")

        case 4:
            call_register_prompt = """
Call register:
1 -> Missed calls
2 -> Received calls
3 -> Dialled numbers
4 -> Erase recent call lists
5 -> Show call duration
6 -> Show call cost
7 -> Call cost setting
8 -> Prepaid
"""
            call_register_choice = get_user_choice(call_register_prompt)

            match call_register_choice:
                case 1:
                    print("Missed calls selected")
                case 2:
                    print("Recieved calls selected")
                case 3:
                    print("Dialled numbers selected")
                case 4:
                    print("Erase recent call lists selected")
                case 5:
                    show_call_duration_prompt = """
Show Call Duration
1 -> Last call duration
2 -> All calls duration
3 -> Received calls duration
4 -> Dialled calls duration
5 -> Clear timers
"""
                    show_call_duration_choice = get_user_choice(show_call_duration_prompt)
                    match show_call_duration_choice:
                        case 1:
                            print("Last call duration selected")
                        case 2:
                            print("All call's duration selected")
                        case 3:
                            print("Received call's duration selected")
                        case 4:
                            print("Dialled call's duration selected")
                        case 5:
                            print("Clear timers selected")
                        
                         
                case 6:
                    show_call_cost_prompt = """
Show Call Cost
1 -> Last call cost
2 -> All calls cost
3 -> Clear counters
"""
                    show_call_cost_choice = get_user_choice(show_call_cost_prompt)
                    match show_call_cost_choice:
                        case 1:
                            print("Last call cost selected")
                        case 2:
                            print("All call's cost selected")
                        case 3:
                            print("Clear counters selected")
                        
                            
                case 7:
                    call_cost_settings_prompt = """
Call Cost Setting
1 -> Call cost limit
2 -> Show costs in
"""
                    call_cost_settings_choice = get_user_choice(call_cost_settings_prompt)
                    match call_cost_settings_choice:
                        case 1:
                            print("Call cost limit selected")
                        case 2:
                            print("Show costs in selected")
                        
                            
                case 8:
                    print("Prepaid credit selected")
                
                    

        case 5:
            tones_prompt = """
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
"""
            tones_choice = get_user_choice(tones_prompt)

            match tones_choice:
                case 1:
                    print("Ringing tone selected")
                case 2:
                    print("Ringing volume selected")
                case 3:
                    print("Incoming call alert selected")
                case 4:
                    print("Composer selected")
                case 5:
                    print("Message alert tone selected")
                case 6:
                    print("Keypad tones selected")
                case 7:
                    print("Warning and game tones selected")
                case 8:
                    print("Vibrating alert selected")
                case 9:
                    print("Screen saver selected")
               

        case 6:
            settings_prompt = """
Settings:
1 -> Call settings
2 -> Phone settings
3 -> Security settings
4 -> Restore factory settings
"""
            settings_choice = get_user_choice(settings_prompt)

            match settings_choice:
                case 1:
                    call_settings_prompt = """
Call Settings:
1 -> Automatic redial
2 -> Speed dialling
3 -> Call waiting option
4 -> Own number sending
5 -> Phone line in use
6 -> Automatic answer
"""
                    call_settings_choice = get_user_choice(call_settings_prompt)

                    match call_settings_choice:
                        case 1:
                            print("Automatic redial selected")
                        case 2:
                            print("Speed dialling selected")
                        case 3:
                            print("Call waiting selected")
                        case 4:
                            print("Own number sending selected")
                        case 5:
                            print("Phone line in use selected")
                        case 6:
                            print("Automatic answer selected")
                        
                            
                case 2:
                    phone_settings_prompt = """
Phone Settings:
1 -> Language
2 -> Cell info display
3 -> Welcome note
4 -> Network selection
5 -> Lights
6 -> Confirm SIM service actions
"""
                    phone_settings_choice = get_user_choice(phone_settings_prompt)

                    match phone_settings_choice:
                        case 1:
                            print("Language selected")
                        case 2:
                            print("Cell info display selected")
                        case 3:
                            print("Welcome note selected")
                        case 4:
                            print("Network selection selected")
                        case 5:
                            print("Lights selected")
                        case 6:
                            print("Confirm SIM service actions selected")
                        
                           
                case 3:
                    security_settings_prompt = """
Security Settings:
1 -> PIN code request
2 -> Call barring service
3 -> Fixed dialling
4 -> Closed user group
5 -> Phone security
6 -> Change access codes
"""
                    security_settings_choice = get_user_choice(security_settings_prompt)

                    match security_settings_choice:
                        case 1:
                            print("PIN code request selected")
                        case 2:
                            print("Call barring service selected")
                        case 3:
                            print("Fixed dialling selected")
                        case 4:
                            print("Closed user group selected")
                        case 5:
                            print("Phone security selected")
                        case 6:
                            print("Change access codes selected")
                        
                           
                case 4:
                    print("Restore factory settings selected")
                

        case 7:
            print("Call divert selected")
        case 8:
            print("Games selected")
        case 9:
            print("Calculator selected")
        
        case 10:
            print("Reminders selected")

        case 11:
            clock_prompt = """
Clock:
1 -> Alarm clock
2 -> Clock settings
3 -> Date setting
4 -> Stopwatch
5 -> Countdown timer
6 -> Auto update of date and time
	"""

            clock_choice = get_user_choice(clock_prompt)
            match clock_choice:
                case 1:
                    print("Alarm clock selected")
                case 2:
                    print("Clock settings selected")
                case 3:
                    print("Date setting selected")
                case 4:
                    print("Stopwatch selected")
                case 5:
                    print("Countdown timer selected")
                case 6:
                    print("Auto update of date and time selected")
                
        case 12:
            print("Profiles selected")
        case 13:
            print("SIM services selected")
        case _: 
            print("Invalid menu selection.")

