// Take a number and print it is positive, negative or zero
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print(num +" is a positive number");
        } else if (num < 0) {
            System.out.print(num + " is a negative number");
        } else {
            System.out.print("You have entered zero");
        }
        sc.close();
    }
}