import java.util.Scanner;
public class grades_by_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kailash kumawat");
        System.out.print("Enter your percentage: ");
        int percentage = sc.nextInt();
        char grade;

        if (percentage >= 90 && percentage <= 100) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else if (percentage >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid percentage!");
            sc.close();
            return;
        }

        System.out.println("Your grade is: " + grade);
        sc.close();
    }
}
