import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original_num = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num /= 10;
        }
        if (sum == original_num){
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
