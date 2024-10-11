import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // Corrected Scanner initialization
        System.out.println("Enter the grade of Student:");
        int grade = sc.nextInt();

        // Check if the grade is within the valid range of 0-10
        if (grade < 0 || grade > 10) {  // Corrected the condition using ||
            System.out.println("Invalid grade! Please enter a number between 0 and 10.");
        } else {
            if (grade <= 3) {
                System.out.println("Failed");
            } else if (grade > 3 && grade <= 5) {
                System.out.println("Insufficient");
            } else if (grade > 5 && grade <= 9) {
                System.out.println("Good");
            } else if (grade == 10) {
                System.out.println("Excellent Grade");
            }
        }
    }
}

