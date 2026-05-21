import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int number;
        int sum = 0;

        while (true) {
            System.out.print("Enter number: ");
            number = sc.nextInt();
            sum += number;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
