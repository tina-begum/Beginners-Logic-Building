//Take three numbers and print the largest 

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            System.out.print(a + " is the largest number.");
        } else if (b > c) {
            System.out.print(b + " is the largest number.");
        } else {
            System.out.print(c + " is the largest number.");
        }
        sc.close();
    }
}
