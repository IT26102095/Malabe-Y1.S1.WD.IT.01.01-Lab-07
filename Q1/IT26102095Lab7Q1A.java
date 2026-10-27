
import java.util.Scanner;

public class IT26102095Lab7Q1A {
    public static void main(String[] args) {
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mark 1: ");
        mark1 = input.nextInt();

        System.out.println("Enter the mark 2: ");
        mark2 = input.nextInt();

        System.out.println("Enter the mark 3: ");
        mark3 = input.nextInt();

        System.out.println("Enter the mark 4: ");
        mark4 = input.nextInt();

        avg = (mark1 + mark2 + mark3 + mark4) / 4.0;

        if (avg >= 75) {
            grade = "Distinction";
        } else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is: " + avg);
        System.out.println("Overall Grade is: " + grade);

        
    }
}


	