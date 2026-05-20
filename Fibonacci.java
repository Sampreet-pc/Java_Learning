import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of element to be found: ");
        int index = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int count = 2; count <= index;count++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(b);
    }
}
