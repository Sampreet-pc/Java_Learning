import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = hcf(2,4);
        System.out.println(num);

    }

    static int hcf(int num1, int num2) {
        int min = num1;
        if (num2 < num1) {
            min = num2;
        }

        int count = 0;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count = i;
            }
        }
        return count;
    }
}
