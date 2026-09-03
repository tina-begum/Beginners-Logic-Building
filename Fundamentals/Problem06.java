//Take two numbers and print larger one
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.print(a + " is larger than " + b);
        } else {
            System.out.print(b + " is larger than " + a);
        }
        sc.close();
    }
}
