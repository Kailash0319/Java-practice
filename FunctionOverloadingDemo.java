import java.util.Scanner;

public class FunctionOverloadingDemo {

    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FunctionOverloadingDemo obj = new FunctionOverloadingDemo();

        System.out.println("Sum of 2 integers: " + obj.add(5, 10));
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 10.5));

        sc.close();
    }
}
