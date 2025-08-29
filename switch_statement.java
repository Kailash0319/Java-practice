import java.util.Scanner;

public class switch_statement {
     
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("enter the number");
        int num1 = scanner.nextInt();

        System.out.println("enter the number");
        int num2 = scanner.nextInt();

        System.out.println("enter the number");
        int num3 = scanner.nextInt();
    
      scanner.close();
        
      switch(num1){

        // old switch statement 
      case 1:
        System.out.println("sunday");
        break;

    case 2:
        System.out.println("monday");
        break;

    case 3:
        System.out.println("tuesday");
        break;

    default:
        System.out.println("invalid day");
        break; 
     
      }

       // new switch statement syntax which required no break
    switch(num2){
    case 1 -> System.out.println("Sunday");
    case 2 -> System.out.println("Monday");
    case 3 -> System.out.println("Tuesday");
    default -> System.out.println("Invalid day");
      } 
       

      String result = switch(num3)
    {
    case 1 -> "Sunday";
    case 2 -> "Monday";
    case 3 -> "Tuesday";
    default -> "Invalid day";
    };
      System.out.println(result);
    }
}
