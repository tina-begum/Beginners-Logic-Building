import java.util.Scanner;
public class Patterns01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pattern01(sc.nextInt());

        // pattern02(sc.nextInt());

        // pattern03(sc.nextInt());

        // pattern04(sc.nextInt());

        //pattern05
        // int n;
        // do {
        //     n = sc.nextInt();
        //     if (n % 2 != 0) {
        //         pattern05(n);
        //         break;
        //     } else System.out.println("Enter odd number of rows");
        // } while (n != 0);

        // pattern06(sc.nextInt());

        // pattern07(sc.nextInt());

        // pattern08(sc.nextInt());

        // pattern09(sc.nextInt());

        // pattern10(sc.nextInt());

        // pattern11(sc.nextInt());
        sc.close();
    }

    public static void pattern01(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern02(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern03(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern04(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern05(int n) {
        int mid = (n+1)/2;
        for (int i = 1; i <= n; i++) {
            if (i <= mid) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 1; j <= n+1-i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern06(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern07(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern08(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern09(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}