import java.util.Scanner;

class while_loop{

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int num = scanner.nextInt();
       
       scanner.close();
       
       int i = 1;

       while(i<=num)
       {
        System.out.println("hello-"+i);
        i++;

        int j=1;
        while(j<=num){
            System.out.println("hello world-"+j);
            j++;
        }
       }

    }
}