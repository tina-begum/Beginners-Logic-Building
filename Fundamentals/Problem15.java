//Take coordinates (x, y) and determine which quadrant the point lies in.
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.println("Enter y coordinate: ");
        int y = sc.nextInt();
        if ((x > 0) && (y > 0)) {
            System.out.println("The point lies in first quadrant.");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("The point lies on second quadrant");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("The point lies on third quadrant");
        } else if ((x > 0) && (y < 0)) {
            System.out.println("The point lies on fourth quadrant");
        } else {
            System.out.println("Origin");
        }
        sc.close();
    }
}
