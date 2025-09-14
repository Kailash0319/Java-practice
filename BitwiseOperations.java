import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Bitwise operations
        System.out.println("\n--- Bitwise Operations ---");
        System.out.println(num1 + " & " + num2 + " = " + (num1 & num2));  // AND
        System.out.println(num1 + " | " + num2 + " = " + (num1 | num2));  // OR
        System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));  // XOR
        System.out.println("~" + num1 + " = " + (~num1));                 // NOT
        System.out.println("~" + num2 + " = " + (~num2));                 // NOT
        System.out.println(num1 + " << 1 = " + (num1 << 1));              // Left shift
        System.out.println(num2 + " << 1 = " + (num2 << 1));
        System.out.println(num1 + " >> 1 = " + (num1 >> 1));              // Right shift
        System.out.println(num2 + " >> 1 = " + (num2 >> 1));

        sc.close();
    }
}
