import java.util.Scanner;
public class FibonacciSeries{
    //  This is the constructor
    public FibonacciSeries(int term) {
        int a = 0, b = 1, c;
        System.out.println("Fibonacci series:");
        for (int i = 1; i <= term; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int term = sc.nextInt();

        // Creating object — constructor will run
        FibonacciSeries sl = new FibonacciSeries(term);

        sc.close();
    }
}
