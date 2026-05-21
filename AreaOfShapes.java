import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Shape: ");
        String shape = sc.nextLine();
        switch (shape) {
            case "circle":
                System.out.print("Enter radius: ");
                int radius = sc.nextInt();
                float area1 = (float)Math.PI * radius * radius;
                System.out.println(area1);
                break;
            case "triangle":
                System.out.print("Enter height: ");
                int height = sc.nextInt();
                System.out.print("Enter base: ");
                int base = sc.nextInt();
                float area2 = 0.5f * height * base;
                System.out.println(area2);
                break;
            case "rectangle":
                System.out.print("Enter length: ");
                int length = sc.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = sc.nextInt();
                int area3 = length * breadth;
                System.out.println(area3);
                break;
            case "rhombus":
                System.out.print("Enter diagonal1: ");
                int d1 = sc.nextInt();
                System.out.print("Enter diagonal2: ");
                int d2 = sc.nextInt();
                float area4 = 0.5f * d1 * d2;
                System.out.println(area4);
                break;
            default:
                System.out.println("Enter Valid Shape");
                break;
        }
    }
}
