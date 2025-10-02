import java.util.Scanner;
public class reverse_string {
    public static void main(String a[]){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // append characters from end
        }
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}