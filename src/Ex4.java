import  java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        isPrimary(userInput);
    }

    public static void isPrimary(int num){
        int count;
        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) {
                    count++;
                    break;
                }
            if (count == 0) {
                System.out.println(i + " ");
            }
        }

    }
}
