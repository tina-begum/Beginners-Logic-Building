//If the sides form a valid triangle, determine whether it is equilateral, isosceles or scalene.
import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        boolean check = checkValidTriangle(a, b, c);
        if (check) {
            typeOfTriangle(a, b, c);
        }

        sc.close();
    }

    public static boolean checkValidTriangle(float a, float b, float c) {
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            return true;
        } else {
            return false;
        }
    }

    public static void typeOfTriangle(float a, float b, float c) {
        if ((a == b) && (b == c)) {
            System.out.print("Equilateral Triangle");
        } else if ((a == b) || (b == c) || (a == c)) {
            System.out.print("Isosceles Triangle");
        } else {
            System.out.print("Scalene Triangle");
        }
    }
}
