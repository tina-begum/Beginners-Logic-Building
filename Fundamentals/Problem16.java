//Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        int amount = sc.nextInt();
        if (amount % 2600 == 0) {
            int notes = amount/2600;
            System.out.println("Amount can be evenly divided");
            System.out.println("2000 notes: " + notes);
            System.out.println("500 notes: " + notes);
            System.out.println("100 notes: " + notes);

        } else {
            System.out.println("Amount cannot be evenly divided");
        }
        sc.close();
    }
}
