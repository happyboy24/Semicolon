import java.util.Scanner;

public class ContainsElement {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print(containsElement(12, new int [] {15,13,13,9,8,5,4,6,7}));

}

public static boolean containsElement(int target, int [] numbers) {
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] == target) {
			return true;
		}
	}

return false;
<<<<<<< HEAD
=======
}
>>>>>>> 6b2786c2c628195068648e7537ac1050cea1e5ca
}
