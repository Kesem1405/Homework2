//main= for from 0 to 1000

//function that get number and prin
//
// \0tthe number if ok

//the function


public class Ex7 {
    public static void main(String[] args){
        int number = 1000;
        calc(number);
    }

public static void calc(int x) { //153
    int numberA;
    int numberB;
    int numberC;
    int sumNumber;
    for(int numCount = 1; numCount<x; numCount++){
        if (numCount <=9) {
                    System.out.println(numCount);
        }
         else if (numCount > 10 && numCount < 100) {
                numberA = numCount % 10;
                numberB = numCount / 10;
                sumNumber = (numberA*numberA) + (numberB*numberB);
                if (sumNumber == numCount){
                System.out.println(numCount);}
         }
       else  if (numCount > 100 && numCount <999) {

            numberA = numCount % 10; //3
            numberC = numCount/100; //1
            numberB = (numCount / 10) %10; //5
                sumNumber = (numberA*numberA*numberA)+(numberB*numberB*numberB)+(numberC*numberC*numberC);
                if (sumNumber == numCount){
                System.out.println(sumNumber);}
         }
    }

     }
}

