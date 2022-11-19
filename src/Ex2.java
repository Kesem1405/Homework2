import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int userInput;
        int jumpNumber;
        int sumNumber;
        Scanner scanner = new Scanner(System.in);
            System.out.println("ENter the starting number");
            userInput = scanner.nextInt();
        System.out.println("Enter the distance number");
        jumpNumber = scanner.nextInt();
        do{
        System.out.println("Enter the sum number");
        sumNumber = scanner.nextInt();
        } while (sumNumber < 0);
        for (int i=1; i<=sumNumber; i++){
            System.out.print(userInput+",");
            userInput+=jumpNumber;}
    }}

