import java.util.Scanner;

public class IT26102095Lab7Q1B {
    public static void main(String[] args) {
		int mark1, mark2, mark3, mark4;
        double avg;
        String grade;
		int studentCount=1;
	Scanner input = new Scanner(System.in);
  while (studentCount<=3){
		System.out.print("Student"+studentCount);
		System.out.print("Enter Marks:");
		mark1 = input.nextInt();
		mark2 = input.nextInt();
		mark3 = input.nextInt();
		mark4 = input.nextInt();
		
	avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
	System.out.println("Average is: " + avg);
	if (avg >= 75) {
            grade = "Distinction";
        } else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
	System.out.println();	
	System.out.println("Overall Grade is: " + grade);
	System.out.println();
	studentCount++;
  }
	}
}

	
		