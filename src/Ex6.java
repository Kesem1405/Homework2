import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int sum;
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
       sum= digitSum(userInput);
        System.out.println(sum);
    }

    //x=5432
    public static int digitSum(int x){
        int sum=0;
        int rest;
        do {
        rest=x%10 ;
            x=x/10;
            sum=sum+rest;
        }while (x !=0);
        return sum;
        }

    }
