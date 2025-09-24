import java.util.Scanner;
public class AverageScore{
public static void main(String[]args){
 Scanner input = new Scanner(System.in);

System.out.print("Enter first score:");
int score1 = input.nextInt();

System.out.print("Enter second score:");
int score2 = input.nextInt();

System.out.print("Enter third score:");
int score3 = input.nextInt();

int AverageScore = 0;
 
AverageScore = score1 + score2 + score3 / 3;

if ( 90 <= AverageScore &&  AverageScore <= 100){
	System.out.print("A");
}

else if (80 <= AverageScore &&  AverageScore < 90){
	System.out.print("B");
}

else if (70 <=  AverageScore &&  AverageScore < 80){
	System.out.print("C");
}

else if (60 <=  AverageScore &&  AverageScore < 70){
	System.out.print("D");
}

else {
	System.out.print("F");
}


}

}
