import java.util.Scanner;

public class SumOfNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumPE = 0;
        int sumPO = 0;
        int sumN = 0;
        while (true) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                sumN += num;
            } else {
                if (num % 2 == 0) {
                    sumPE += num;
                } else {
                    sumPO += num;
                }
            }
        }
        System.out.print("Negative: " + sumN);
        System.out.println();
        System.out.print("Positive Even: " + sumPE);
        System.out.println();
        System.out.print("Positive Odd: " + sumPO);
    }
}


