//Find GCD of two numbers
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        while (secondNumber > 0) {
            int temp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        System.out.println("GCD of the numbers: " + firstNumber);
        sc.close();
    }
}
