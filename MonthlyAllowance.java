import java.util.Scanner;

public class MonthlyAllowance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        String month = sc.next().trim();
        int days = 0;

        switch (month) {
            case "January":
                days = 31;
        }
    }
}
