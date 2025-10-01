import java.util.Scanner;
public class nature_of_root { 
    public static void main(String[] args) { 
          System.out.println("Kailash Kumavat"); 
        Scanner scanner = new Scanner(System.in); 
 
      
        System.out.print("Enter coefficient a: "); 
        double a = scanner.nextDouble(); 
 
        System.out.print("Enter coefficient b: "); 
        double b = scanner.nextDouble(); 
 
        double D = b * b; 
 
        System.out.println("Discriminant (D) = " + D); 
 
        if (a == 0) { 
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation."); 
        } else { 
            if (D > 0) { 
                System.out.println("Roots are real and equal to:"); 
               
                double root1 = 0; 
                double root2 = -b / a; 
                System.out.println("Root 1 = " + root1); 
                System.out.println("Root 2 = " + root2); 
            } else if (D == 0) { 
 
                System.out.println("Roots are real and equal:"); 
                double root = 0; 
                System.out.println("Root = " + root); 
            } else { 
                
                System.out.println("Roots are complex."); 
            } 
        } 
 
        scanner.close(); 
    } 
}