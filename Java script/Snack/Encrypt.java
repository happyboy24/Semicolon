import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

int sum = 0;
int digit = 4;
int reminder = 0;

for(int count = 1; count <= digit; count++) {
System.out.print("Enter four number: ");
int num = input.nextInt();
   

    sum = num + 7;
    reminder = sum % 10;
   
    if (count == 1) {
        //System.out.println(count == 2);   
}
   
        else if (count == 2) {
        //System.out.println(count == 4);     
}
  System.out.println("the sum is: " + sum);
    System.out.println("the reminder is: " + reminder);
   System.out.println("Sum: " + sum + "reminder: " + reminder);

  }

}
}

