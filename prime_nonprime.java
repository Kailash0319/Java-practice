import java.util.Scanner;

public class prime_nonprime {
    public static void main(String[] args) {
    System.out.println("Kailash Kumavat"); 

        Scanner k = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = k.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            // for (int i = 2; i * i <= num ; i++)
            // for (int i = 2; i <= num -1 ; i++)
            
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is a Non-Prime number.");
        }

        k.close();
    }
}
