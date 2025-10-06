public class Kata{

public static int numberOfFactors(int number){

int counter = 0;
int numbertocheck = 0;
	for (int count = 1; count <= number; count++){
	if (number % count == 0){
		counter++;
	}
	
}
	return counter;

}



public static Boolean isprime(int number){
	 if(number <= 1){
	   return false;
}
	for(int cont = 2; cont*cont <= number; cont++);
	if (number % 2 == 0){
	return false;
}
	return true;
}
	
	public static boolean isOdd(int number) {
	if(number % 2 != 0) {
		return true;
	}
	if(number % 2 == 0) {
		return false;
	}
	return false;
}




	public static boolean isEven(int number) {
	if(number % 2 == 0) {
		return true;
	}
	return false;
}

	

	public static int subtract(int firstNumber, int secondNumber) {
	int difference = firstNumber - secondNumber;
	if(difference < 0) {
		difference *= -1;
	}
	return difference;
}

	public static boolean isSquare(int number) {
	int divisor = 1;
	int Count = 0;
	while(divisor <= number) {
		int divide = number % divisor;
		if(divide == 0){
			Count += 1;
		}
		divisor += 1;
	}

	if(Count % 2 != 0) {
		return true;
	}

	return false;
}
 
	public static long factorialOf(int number){
	int factorial = 1;
	int counter = 1;
	while(counter <= number) {
		factorial *= counter;
		counter++;
	}
	return factorial;
}

	public static long squareOf(int number) {
	int sum = number * number;
	return sum;
}

	public static float divide(int firstNumber, int secondNumber) {
	if(secondNumber == 0) {
		return 0;
	} else {
		return firstNumber / secondNumber;
}

}

	public static boolean isPalindrome(int number) {
	int firstDigit = number / 10000;
	int secondDigit = (number % 10000) / 1000;
	int thirdDigit = (number % 1000) / 100;
	int fourthDigit = (number % 100) / 10;
	int fifthDigit = number % 10;
	if(firstDigit == fifthDigit & secondDigit == fourthDigit) {
		return true;
}	
	return false;
}
}
