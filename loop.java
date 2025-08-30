import java.util.Scanner;

class loop{

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int num = scanner.nextInt();
       
       scanner.close();
       
       int i = 0;

       while(i<=num)
       {
        System.out.println("hello-"+i);
        i++;
       }

    }
}