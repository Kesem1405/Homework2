import java.util.Scanner;


public class Main {

    public static void results(int a, int b, int c) {
        double resultSqrt,resultA,resultB;
        resultSqrt = ((b * b) - (4 * a * c));
        Math.sqrt(resultSqrt);

        if (resultSqrt < 0) {
            System.out.println("Invaild solution.");
        } else {
            resultA = ((-b) + (resultSqrt)) / (2 * a);
            resultB = ((-b) - (resultSqrt)) / (2 * a);
            if (resultA == resultB) {
                System.out.println("The solution is" + resultA);
            }
            else{
                System.out.println("The solution of x1 is" + resultA + "and the solution of x2:" + resultB);
            }
        }}


    public static void main(String[] args) {
        int numA;
        int numB;
        int numC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your A Number");
        numA = scanner.nextInt();
        System.out.println("Enter your B Number");
        numB = scanner.nextInt();
        System.out.println("Enter your C Number");
        numC = scanner.nextInt();
        results(numA,numB,numC);
    }
}