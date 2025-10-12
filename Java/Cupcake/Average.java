public class Average {
public static void main(String[] args) {

System.out.print(averageArray(new int [] {23,12,19,16,30,8,9,10}));
}

public static double averageArray(int[] numbers) {
	int count = 0;
	double sum = 0.0;
	
	while(count < numbers.length) {
		sum += numbers[count];
		count++; 
	}
	return sum / count;

}
}
