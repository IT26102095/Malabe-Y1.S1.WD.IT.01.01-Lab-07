
import java.util.Scanner;

public class IT26102095Lab7Q3 {
    public static void main(String[] args) {

        final double DISCOUNT_RATE = 0.05;
        final int NUMBER_OF_CUSTOMERS = 5;

        double billamount, amounttopay;
        char PaymentMode;

        double discount = 0;
        Scanner input = new Scanner(System.in);

        for (int customercount = 1; customercount <= NUMBER_OF_CUSTOMERS; customercount++) {

            System.out.println("Customer: " + customercount);

            System.out.println("Enter the total bill amount: ");
            billamount = input.nextDouble();

            System.out.println("Enter the mode of payment (C for cash, O for other):");
            PaymentMode = input.next().toUpperCase().charAt(0);

            if (PaymentMode == 'C') {
                discount = billamount * DISCOUNT_RATE;
                amounttopay = billamount - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amounttopay);
            }
            else if (PaymentMode == 'O') {
                amounttopay = billamount;

                System.out.println("No Discount Applicable");
                System.out.println("Amount to be paid: " + amounttopay);
            }
            else {
                System.out.println("Payment Mode is Not Valid");
                System.out.println();
                continue;
            }

            System.out.println();
        }

       
    }
}
