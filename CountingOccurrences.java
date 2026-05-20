import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        int[] n = {1, 3, 8, 5, 7, 5, 7, 8, 7, 9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element whose occurrence is to be found: ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == a) {
                count++;
            }
        }
        System.out.println(count);
    }

}

/*
COUNTING OCCURRENCE IN NUMBER

n = 45535;

int count = 0;

while n > 0
int rem = n % 10;
if rem == 5
    count++
n / 10
 */
