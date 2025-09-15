import java.util.Scanner;

public class Mileage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                int totalMiles = 0;
                int totalGallons = 0;

                System.out.print("Enter miles driven for the trip: ");
        int miles = input.nextInt();

                while (miles >= 0) {
                        System.out.print("Enter gallons used for the trip: ");
            int gallons = input.nextInt();

                        if (gallons > 0) {
                
               //* double milesPerGallon = (double) miles / gallons;
                System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

                               totalMiles = miles;
                             totalGallons = gallons;

                
                if (totalGallons > 0) {
                    double combinedMPG = (double) totalMiles / totalGallons;
                    System.out.printf("Combined miles per gallon to date: %.2f%n", combinedMPG);
                }
            } else {
                System.out.println("Gallons used must be greater than zero.");
            }*\\