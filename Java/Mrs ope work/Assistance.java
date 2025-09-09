import java.util.Scanner;

public class Assistant{
  public static void main(String[]args){

   Scanner input = new Scanner(System.in);

  System.out.print("Enter your name: ");
   String name = input.nextLine();
  
  System.out.print("Enter your age: ");
  int age = input.nextInt();

System.out.print("Enter your mood (happy, sad, excited, tired or depressed): ");
  String mood = input.nextLine();
 input.nextLine();
 
System.out.print("guess a number: ");
  int guess = input.nextInt();

System.out.println("Hello," + name + "! Welcome to your personal assistance" );

input.nextLine();
 

   if(age < 13){
  System.out.printf("you are a young explorer!");
}
   if(age >= 13 && age <= 19){
    System.out.printf("Teen life is fun, enjoy it!");
}
   if(age >= 20 && age <= 59){
     System.out.printf("Aduling can be challenging, stay strong!");
}
   if(age > 60){
    System.out.printf("Wisdom looks good on you!");
}
    if(mood.equals ("depressed")){
    System.out.println("Go to the gym");
 }
   if(mood.equals ("happy")){
   System.out.println(" go out and play a sport you like!");
}
if(mood.equals ("sad")){
   System.out.println(" Take a short walk outside and get some fresh air!");
}
if(mood.equals ("Excited")){
   System.out.println(" Share your excitement by helping someone!");
}
if(mood.equals ("Tired")){
   System.out.println(" Have a short nap or rest to recharge!");
}

input.nextLine();
 

 if(guess == 2){
   System.out.print(" Wow you got it right");
}

else if(guess > 2){
   System.out.println(" Try again, best luck next time");
}


}
    
}