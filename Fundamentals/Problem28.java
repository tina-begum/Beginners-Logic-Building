import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD: " + a);
        System.out.println("LCM: " + product/a);
        sc.close();
    }
}
