//If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b > c) || (b + c > a) || (a + c > b)) {
            if ((a == b) && (b == c)) {
                System.out.print("Equilateral triangle");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.print("Isosceles triangle");
            } else {
                System.out.print("Scalene triangle");
            }
        } else {
            System.out.print("Enter the sides again that forms a valid triangle");
        }
        sc.close();
    }
}
