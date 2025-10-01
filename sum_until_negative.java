import java.util.Scanner;

public class sum_until_negative {
    public static void main(String[] args) {
        System.out.println("kailash kumawat ");
        Scanner sc = new Scanner(System.in);
        int sum = sumPositiveNumbers(sc);
        System.out.println("Sum of entered numbers: " + sum);
        sc.close();
    }

   
    public static int sumPositiveNumbers(Scanner sc) {
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }
            sum += num;
        }
        return sum;
    }
}
