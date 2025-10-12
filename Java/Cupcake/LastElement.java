public class LastElement {
public static void main(String[] args) {
int [] numbers = { 13, 14, 15, 16,3, 9, 8};

System.out.print("The last element is :" + getLastElement(numbers));
}
public static int getLastElement(int[] numbers) {
	if(numbers.length == 0) {
		return 0;
	}
	return numbers[numbers.length - 1];



}
}