import java.util.Scanner;
public class Flakes{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);

   System.out.print("Enter a number:");
    int num = input.nextInt();

       int x = 0 ;
       int multiple = 0;
       int result = 0;

      while (x < 12) {
       result = num * x;
         x++;
          System.out.printf(" %d * %d = %d %n", num, x, result);
}


}
}



//prompt the user to input a number.
//store it in a variable (num).
// intialize the variable. 
// loop should start from zero while the increment from one and condition lessthan tweleve.
//the summation should end after the multiplication has reached the condition given.
// print out the result