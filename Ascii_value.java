import java.util.Scanner;

public class Ascii_value {
    
    public static void main(String a[]){

        Scanner k = new Scanner(System.in);

        System.out.println("enter the character");
        char character = k.next().charAt(0);

        k.close();

        int result = character ;

        System.out.println("AScii value of "+character+" is "+result);
    }
}
