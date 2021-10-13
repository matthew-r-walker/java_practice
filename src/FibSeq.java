public class FibSeq {


    static void fibonacci(int Num) {
        int num1 = 0, num2 = 1, num3, count = 0;


        for (int i = 0; i < Num; i++) {

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
        System.out.print(num1 + " ");
    }
    public static void main(String[] args) {
//        int test = 10;
        Fibonacci(5);
        System.out.println();
    }

}
