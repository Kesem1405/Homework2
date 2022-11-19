import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int numberA = 0;
        int numberB = 1;
        int numberC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();
        do {
            numberC = numberA+numberB;
            numberA=numberB;
            numberB=numberC;

        }while (numberB<userNumber);
        if(userNumber == numberB) {
            System.out.println("true");
        }else System.out.println("false");

    }

}
