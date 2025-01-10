import java.util.Scanner;

public class IT24102186Lab5Q3 { 
    public static void main(String[] args) {
        
        final int ROOM_RATE = 48000; 
        final int DISCOUNT_THRESHOLD = 3; 
        final double DISCOUNT_RATE = 0.20; 

        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates should be between 1 and 31");
            return; // Exit the program
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date");
            return; // Exit the program
        }

        
        int numberOfDays = endDate - startDate;

        
        double totalCost = ROOM_RATE * numberOfDays;

        
        if (numberOfDays >= DISCOUNT_THRESHOLD) {
            totalCost -= totalCost * DISCOUNT_RATE; // Apply 20% discount
        }

        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid: " + totalCost);
    }
}
