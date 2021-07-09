import java.util.Scanner;

public class NumberTriangle {
    private Scanner sc = new Scanner(System.in);

    public void numberTriangle() {
        System.out.println("What number would you like your number triangle to stop at?");
        int userNum = sc.nextInt();
        String numTri = "";
        for (int i = 1; i <= userNum; ++i) {
                numTri += i + " ";
                System.out.println(numTri);
        }
    }

    public static void main(String[] args) {
        NumberTriangle nt = new NumberTriangle();
        nt.numberTriangle();
    }
}
