import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a odd number that bigger than 3.");
            userNumber = scanner.nextInt();
        } while (userNumber < 3 || userNumber % 2 == 0);
        printDiamonds(userNumber);
    }
        public static void printDiamonds(int number){
            int j, i, space, k;
            int index = 1;
            space = number / 2;  //5/2=2
            for (i = 1; i <= number; i+=2) {
                System.out.println(" ");
                for (j = 0; j < index; j++) {
                    System.out.print("*");
                }
                for (k = 0; k < space; k++) {
                    System.out.print(" ");
                }
                if (index != number) {
                    index = index + 2;
                }
            }
            index = index - 2;
            for (i = 0; i < space; i++) {
                System.out.println(" ");
                for (k = 0; k < index; k++) {
                    System.out.print("*");
                }
                index = index - 2;
            }
        }
    }
