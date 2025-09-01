import java.util.Scanner;

class calculator {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
         
        scanner.close();

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;      
        int remainder = num1 % num2;      

        System.out.println( num1 + " + " + num2 + " = " + sum);
        System.out.println( num1 + " - " + num2 + " = " + subtraction);
        System.out.println( num1 + " * " + num2 + " = " + multiplication);
        System.out.println( num1 + " / " + num2 + " = " + division);
        System.out.println( num1 + " % " + num2 + " = " + remainder); 
    }
}
