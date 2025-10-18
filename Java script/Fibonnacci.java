public class Fibonnacci{
	public static void main(String [] args){

		int nextNumber = 0;
		
		for (int index = 0; index < 20; index++) {
			int sum = index + nextNumber;
			System.out.println(sum);
			nextNumber = index;
		}
	}
}