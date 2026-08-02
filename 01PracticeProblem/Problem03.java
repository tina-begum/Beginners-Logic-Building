// Take three sides and check if they form a valid triangle.
import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        if ((a + b > c) || (b + c > a) || (a + c > b)) {
            System.out.print("Valid Triangle");
        } else {
            System.out.print("Invalid triangle.");
        }
        sc.close();
    }
}
