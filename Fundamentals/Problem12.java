//Take a 3-digit number and check if all digits are distinct.

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3-digit number: ");
        int num = sc.nextInt();
        int hundredsPlace = num/100;
        int tensPlace = (num%100)/10;
        int onesPlace = num%10;
        if ((hundredsPlace != tensPlace) && (hundredsPlace != onesPlace) && (tensPlace != onesPlace)) {
            System.out.println("All digits are distinct");
        } else {
            System.out.println("All digits are not distinct");
        }
        sc.close();
    }
}
