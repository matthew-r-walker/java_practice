import java.util.Scanner;

public class OddNums {
    private Scanner sc = new Scanner(System.in);

    public void oddNums() {
        System.out.println("How many odd numbers would you like to see?");
        int userNum = sc.nextInt();
        int sum = 0;
        System.out.print("The odd numbers are: ");
        for (int i = 0; i < userNum * 2;) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
                sum += i;
            }
            i++;
        }
        System.out.println("\nThe Sum of odd natural numbers up to " + userNum + " terms: " + sum);
    }

    public static void main(String[] args) {
        OddNums oddNums = new OddNums();
        oddNums.oddNums();
    }
}
