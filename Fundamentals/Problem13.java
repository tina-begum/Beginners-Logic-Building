//Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3-digit number: ");
        int num = sc.nextInt();
        int firstDigit = num/100;
        int middleDigit = (num%100)/10;
        int lastDigit = num%10;
        if ((middleDigit > firstDigit) && (middleDigit > lastDigit)) {
            System.out.println("Middle digit is the largest");
        } else if ((middleDigit < firstDigit) && (middleDigit < lastDigit)) {
            System.out.println("Middle digit is the smallest");
        } else {
            System.out.println("Middle digit is neither largest nor smallest");
        }
        sc.close();
    }
}
