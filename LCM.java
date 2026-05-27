public class LCM {
    public static void main(String[] args) {
        int num = lcm(3, 4);
        System.out.println(num);

    }
    static int lcm(int num1, int num2) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }

        int count = 0;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count = i;
            }
        }

        int lcm = (num1 * num2) / count;
        return lcm;
    }
}
