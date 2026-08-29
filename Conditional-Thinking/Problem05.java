//Check if a given year is a leap year
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.print(year + " is a Leap year.");
        } else {
            System.out.print(year + " is not a Leap year.");
        }
        sc.close();
    }
}
