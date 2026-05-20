public class ReverseNumber {
    public static void main(String[] args) {
        int n = 23597;
        int rem = 0;
        int sum = 0;

        while (n > 0) {
            rem = n % 10;
            n = n / 10;

            sum = sum * 10 + rem;
        }
        System.out.println(sum);
    }
}
