public class PalindromeString{
	public static void main(String [] args){
	
String name = "Ebunoluwa";
String store = " ";

String letters = "";

		for(int count = name.length() - 1 ; count >= 0; count--){
			letters += String.valueOf(name.charAt(count));
		}

		
		if(name.equals (letters)){
			System.out.print("It is a palindrome");
		}
		else{
			System.out.print("It is not a palindrome");
		}
	}
}