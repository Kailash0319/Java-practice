import java.util.Scanner;

public class Quotient_remainder {
    
    public static void main(String[] args){
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
         
        scanner.close();

        int Quotient = num1 / num2 ;
        int remainder = num1 % num2 ;

        System.out.println("The quotient of "+num1+" / "+num2+" = "+Quotient);
        System.out.println("The remainder of "+num1+" % "+num2+" = "+remainder);
    }
}
