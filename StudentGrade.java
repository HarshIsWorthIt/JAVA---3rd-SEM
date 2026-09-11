import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        double percentage = (double) marks;

        String grade;
        String status;

        if (percentage >= 90) {
            grade = "A+";
            status = "PASS";
        } else if (percentage >= 75) {
            grade = "A";
            status = "PASS";
        } else if (percentage >= 60) {
            grade = "B";
            status = "PASS";
        } else if (percentage >= 45) {
            grade = "C";
            status = "PASS";
        } else if (percentage >= 33) {
            grade = "D";
            status = "PASS";
        } else {
            grade = "F";
            status = "FAIL";
        }

        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        sc.close();
    }
}