import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
