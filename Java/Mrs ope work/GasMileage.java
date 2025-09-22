import java.util.Scanner;

public class GasMileage {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int totalMile = 0;
int totalGallon = 0;

System.out.print("Enter mile driven: ");
int mile = input.nextInt();

while(mile != -1) {

System.out.print("Enter gallon used: ");
int gallon = input.nextInt();

double mpg = (double) mile / gallon;
System.out.println(mpg + " mile per gallon");

totalMile =+ mile;
totalGallon =+ gallon;

double totalMpg = (double) totalMile / totalGallon;
System.out.println(totalMpg + " total mile per gallon");

System.out.print("Enter mile driven(-1 to quit): ");
mile = input.nextInt();
}
}
}