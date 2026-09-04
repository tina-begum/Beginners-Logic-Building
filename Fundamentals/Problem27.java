import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print all numbers between a and b divisible by 7.
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a+1; i < b; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
