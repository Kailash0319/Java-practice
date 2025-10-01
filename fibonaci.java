import java.util.Scanner;
public class fibonaci {

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Iterative Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();

        // Display using iterative method(non-recursive method)
        fibonacciIterative(n);

        // Display using recursive method
        System.out.print("Recursive Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}