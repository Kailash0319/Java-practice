public class SwapExample {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap with temp variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
