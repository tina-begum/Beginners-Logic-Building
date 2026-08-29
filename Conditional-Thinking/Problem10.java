//Take three sides and check if they form a valid triangle.
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b > c) || (b + c > a) || (a + c >b)) {
            System.out.print("Valid triangle");
        } else {
            System.out.print("Invalid triangle");
        }
        sc.close();
    }
}
