import java.util.Scanner;
	public class Strong{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("enter a number: ");
			int number = input.nextInt();
 

			int mod = 0;
			int div = number;
			int modsum = 1;

			int addmod = 1;
			
		while(div > 0){
		mod = div % 10;

		while(mod != 0){
		modsum += mod;
		mod --;
}

	addmod += modsum;
	modsum = 1;
	div = div / 10;

}

if(addmod == number){
 System.out.printf(" is a strong number " + number);

}

else{
  System.out.printf("is not a strong number %n " + number);

}

}

}