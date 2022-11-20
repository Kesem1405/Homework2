import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a odd number that bigger than 3.");
            userNumber = scanner.nextInt();
        } while (userNumber < 3 || userNumber % 2 == 0);
        printDiamond(userNumber);
    }

    public static void printDiamond(int number) {
        int i, j, k, space;
        space = number / 2;
        for( i = 1; i<=number;i+=2) {
            for( j = 0; j< space; j++){
                System.out.print(" ");
            }
            for(k = 0; k< i;k++){
                System.out.print("*");
            }
            space = space-1;
            System.out.println(" ");

        }
        space = 0;
        for (i = number -2;i>=1;i-=2){
            space = space + 1;
            for (j = 0; j<space; j++){
                System.out.print(" ");
            }
            for(k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}