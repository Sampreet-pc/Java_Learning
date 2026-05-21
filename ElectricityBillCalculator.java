import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units <= 100) {
            int bill1 = units * 5;
            System.out.println("Bill is : " + bill1);
        } else if (units > 100 && units <= 200) {
            int bill2 = ((units - 100) * 7) + 500;
            System.out.println("Bill is : " + bill2);
        } else {
            int bill3 = ((units - 200) * 10) + 1200;
            System.out.println("Bill is : " + bill3);
        }
    }
}
