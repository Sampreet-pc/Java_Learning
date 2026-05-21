import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next().trim().toLowerCase();

        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) == word.charAt(j)) {
                i++;
                j--;
            }else {
                System.out.println("Not palindrome");
                break;
            }
            if (i == j){
                System.out.println("Palindrome");
            }
        }
    }
}
