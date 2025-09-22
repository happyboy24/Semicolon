import java.util.Scanner;
	public class StrongNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			int count = 1;
			int mod = 0;
			int div = number;
			int modsum = 1;
			int total = 0;
			
			while(div > 0){
				mod = div % 10;

				while(mod != 0){
					
					modsum += mod;
					System.out.println(modsum);
					mod--;
					

				}
				total = total+ modsum;
				div = div / 10;

				
				
			
				modsum = 0;				

			

			}

			/*if( total == number){
				 
					System.out.printf("%d is a strong number",total);

				}
				else{
				System.out.printf("%d is a not strong number %n",number);
				}*/
		
		}

	}