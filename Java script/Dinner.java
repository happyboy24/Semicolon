public class Dinner{
public static void main(String [] args){

for(int even = 1; even <= 100; even++){
if(even % 2 == 0){
System.out.print("Even numbers from 1 to 100:" + even + " ")

}

}

for(int odd = 50; odd <= 100; odd++){
if(odd % 2! == 0){
System.out.print("Odd numbers from 1 to 100:" + odd + " ")
}

}
for(int numbers = 1; numbers <= 100; numbers++){
		System.out.print("This are numbers from 1 to 100: " + numbers + " ");
	}

	for(int count = 0; count <= 20; count++){
		int square = count * count;
		System.out.print("This are the square of numbers from 1 to 200: " + square + " ");
}
	for(int number = 1; number <= 50; number++){
		if (number % 3 == 0){
		System.out.println("This are the multiples of 3 between 1 and 50: " + number + " ");
	}
}
	for (int number = 0; number <= 100; number++){
		if (number % 3 == 0 && number % 5 == 0){
		System.out.print(number + " ");
		}
	}
	int counter = 0;
	for(int count = 1; count <= 100; count++){
		if (count % 7 == 0){
		counter++;
	}	
}
	System.out.println(counter);
	
	int sum = 0;
	for(int number = 1; number <= 50; number++){
		sum += number;
	}
	System.out.print(sum);

	int product = 0;
	for(int number = 1; number <= 10; number++){
		product *= number;
	}
	System.out.println (product);

	for(char character = 'A'; character <= 'Z'; character++){
	System.out.print(character + " ");
	}
	

	int number = 0;
	int multiplication = 0;
	for(int count = 0; count <= 12; count++){
	multiplication = count * 4;
	System.out.println(multiplication);
	}
	

	char character = 'e';
	int characters = 0;
	String words = "shallee";
	
	for(int count = 0; count < words.length(); count++){
	char letters = words.charAt(count);
	if (letters == character){
		characters++;
	}
	
}	System.out.print(characters);