
import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units;
        double bill;

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4);
        }

        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: ₹" + bill);

        sc.close();
    }
}
