// Check if a given year is a leap year
import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            isLeap = true;
        }
        System.out.println("Is a leap year ?: " + isLeap);
        sc.close();
    }
}