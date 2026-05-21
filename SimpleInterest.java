import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amt: ");
        int principal = sc.nextInt();

        System.out.println("Enter no. of years: ");
        int year = sc.nextInt();

        System.out.println("Enter rate of Intereset: ");
        int rate = sc.nextInt();

        float simpleInterest = (((float)principal * year * rate) / 100);
        System.out.println("Simple Interest is " + simpleInterest);
    }
}
