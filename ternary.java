import java.util.Scanner;
public class ternary {
    
    public static void main(String[] args){

    System.out.println("Enter the number :");
    Scanner reader = new Scanner(System.in);
    int num = reader.nextInt();

    String result = (num >= 0) ?  ( (num > 0) ? "positive" : "zero" ) : "negative" ;
    System.out.println("the number is "+result);
    
    reader.close();
      }
} 