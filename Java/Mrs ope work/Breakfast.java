
import java.util.Scanner;
	public class Breakfast{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			int n = number;
			int sum = 0;

if (n > 0) {
          n = number % 10;
        
        int factorial = 1;      
      for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }
        sum += n;
		System.out.printf("%d is a strong number",sum);

    }
 	else {
             System.out.printf("%d is not a strong number",sum);
    }
}
}