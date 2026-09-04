import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print first n terms of an arithmetic progression (a, d).
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Enter first term: ");
        int a = sc.nextInt();
        System.out.println("Enter difference: ");
        int d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + i*d + " ");
        }
        sc.close();

    }
}
