public class Palindrome{
	public static void main(String [] args){
	
int number = 2409199;
int store = number;

String reversed = "";

	while(number > 0){
	
	int dividedNumber = number % 10;
	reversed += dividedNumber;
	number /= 10;

	}

	int convertedNumber = Integer.parseInt(reversed);

	if(store == convertedNumber){
		System.out.print("It is a palindrome");
	}
	else{
	System.out.print("it is not a palindrome");
	}

}
}