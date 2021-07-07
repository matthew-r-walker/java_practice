import java.util.Scanner;

public class AverageOfTenNums {
    Scanner sc = new Scanner(System.in);
    private int nums = 0;

    public void getTenNums() {
        System.out.println("Average of 10 numbers, enter a number when prompted.");
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i + ". Enter a number.");
            int userNum = sc.nextInt();
            nums += userNum;
        }
        System.out.println("The sum of the 10 input numbers is: " + nums);
        System.out.println("The average is: " +  ((double) nums / 10));
    }

    public static void main(String[] args) {
        AverageOfTenNums test = new AverageOfTenNums();
        test.getTenNums();
    }
}
