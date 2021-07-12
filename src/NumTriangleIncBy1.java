import java.util.Scanner;

public class NumTriangleIncBy1 {
    private Scanner sc = new Scanner(System.in);

    public void numTri() {
        System.out.println("What number would you like your number triangle to stop at?");
        int userNum = sc.nextInt();
        int lineLengthCount = 1;
        int currentLineLengthCount = 0;
        for (int i = 1; i <= userNum; ++i) {
            System.out.print(i + " ");
            currentLineLengthCount++;
            if (currentLineLengthCount == lineLengthCount) {
                lineLengthCount++;
                currentLineLengthCount = 0;
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        NumTriangleIncBy1 nt1 = new NumTriangleIncBy1();
        nt1.numTri();
    }
}
