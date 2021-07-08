import java.util.Scanner;

public class Cubed {
    private Scanner sc = new Scanner(System.in);


    public void cubeNum() {
        System.out.println("Enter a number you wish to cube.");
        int userNum = sc.nextInt();
        System.out.printf("Number is : %d and the cube of %d is : %d", userNum, userNum, (userNum * userNum * userNum));
    }

    public static void main(String[] args) {
        Cubed cube = new Cubed();
        cube.cubeNum();
    }
}
