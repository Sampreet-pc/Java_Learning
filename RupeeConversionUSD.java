import java.util.Scanner;

public class RupeeConversionUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter rupees amt: ₹");
        int rupee = sc.nextInt();

        System.out.print("Conversion in Dollar is $" + (rupee / 96.61));
    }
}
