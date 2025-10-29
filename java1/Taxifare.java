import java.util.Scanner;

public class Taxifare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input taxi details
        System.out.print("Enter Taxi No: ");
        String taxiNo = sc.nextLine();

        System.out.print("Enter distance covered (in km): ");
        double distance = sc.nextDouble();

        double amount = 0;

        // Fare calculation
        if (distance <= 5) {
            amount = 100;   // fixed amount up to 5 km
        } else if (distance <= 15) {
            amount = 100 + (distance - 5) * 10;
        } else if (distance <= 30) {
            amount = 100 + (10 * 10) + (distance - 15) * 8;
        } else 
        {
            amount = 100 + (10 * 10) + (15 * 8) + (distance - 30) * 5;
        }

        // Print bill
        System.out.println("\n********** Taxi Bill **********");
        System.out.println("Taxi No: " + taxiNo);
        System.out.println("Distance Covered: " + distance + " km");
        System.out.println("Amount: Rs. " + amount);
}
}
