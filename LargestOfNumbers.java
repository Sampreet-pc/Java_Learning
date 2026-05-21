import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int max = 0;

        while (true) {
            System.out.print("Enter number: ");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.print("maximum number: " + max);
    }
}
