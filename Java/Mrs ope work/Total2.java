import java.util.Scanner;
public class Total2{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number:");
int total = input.nextInt();

int x = total + 1;

 while (x <= 100){
   total = total + x;
   ++x; 
System.out.print(x);
}

}
}