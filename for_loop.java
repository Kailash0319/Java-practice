import java.util.Scanner;

public class for_loop {

    public static void main(String a[])
    {
     Scanner scanner = new Scanner(System.in);

     System.out.println("enter the number ");
     int num = scanner.nextInt();

     scanner.close();

     // printing every month 5 days 
     for(int i=1 ; i<=num ; i++)
     {
        System.out.println("month -"+i);

        for(int j=1 ; j<=5 ; j++)
        {
            System.out.println(j+"_"+i+"_2025");
        }
     }

    } 
}
