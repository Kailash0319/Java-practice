
import java.util.Scanner;

class do_while_loop{

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int num = scanner.nextInt();
       
       scanner.close();

      do{
        System.out.println("hello world-"+num);
        num++;
      }
      while(num<=10);
       }

    }
