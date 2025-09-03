import java.util.Scanner;

public class sum_and_average {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num3 = scanner.nextInt();
         
        scanner.close();

        int sum = num1 + num2 + num3;
        float average = sum / 3 ;

        System.out.println("sum = " +sum);
        System.out.println("average = "+average);
      }
}
