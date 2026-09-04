import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print the squares and cube of numbers from 1 to n.
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Square of " + i + " = " + (int)(Math.pow(i, 2)));
            System.out.println(" Cube of " + i + " = " + (int)(Math.pow(i, 3)));
        }
        sc.close();

    }
}
