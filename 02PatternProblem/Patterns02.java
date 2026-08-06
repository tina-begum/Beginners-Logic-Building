import java.util.Scanner;
public class Patterns02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pattern01(sc.nextInt());
        // pattern02(sc.nextInt());
        // pattern03(sc.nextInt());
        // pattern04(sc.nextInt());
        // pattern05(sc.nextInt());
        sc.close();
    }

    public static void pattern01(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern02(int n) {
        //upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern03(int n) {
        boolean val = true;
        for (int i = 1; i <= n; i++) {
            boolean temp = val;
            for (int j = 1; j <= i; j++) {
                System.out.print((temp?1:0) + " ");
                temp = !(temp);
            }
            val = !(val);
            System.out.println();
        }
    }

    public static void pattern04(int n) {
        char letter = 'A';
        for(int i=1; i<=n; i++){
            char ch = letter;
            for(int j=1; j<=n-i+1; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern05(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int k=1; k<=2*i-1; k++){
                System.out.print(ch);
                if(k<=((2*i-1)/2)) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}
