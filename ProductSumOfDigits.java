import java.util.Scanner;

public class ProductSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int copyNumber = num;
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            product *= digit;
            copyNumber /= 10;
        }
        int subtractSum = product - sum;
        System.out.println(subtractSum);
    }
}
