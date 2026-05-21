import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int count = 0; count < n; count++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;

        }

    }
}
