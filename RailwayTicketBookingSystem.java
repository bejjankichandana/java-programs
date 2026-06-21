
import java.util.Scanner;

public class RailwayTicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String passengerName;
        String source;
        String destination;
        int age;
        double fare;

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Source Station: ");
        source = sc.nextLine();

        System.out.print("Enter Destination Station: ");
        destination = sc.nextLine();

        fare = 250.0;

        System.out.println("\n===== RAILWAY TICKET =====");
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Age            : " + age);
        System.out.println("From           : " + source);
        System.out.println("To             : " + destination);
        System.out.println("Fare           : ₹" + fare);
        System.out.println("Ticket Booked Successfully!");

        sc.close();
    }
}
