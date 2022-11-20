public class Ex7Try{
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++)
        {
            cacl(i);
        }
    }

    public static void cacl(int x) { //153
        int baseNumber = x;
        int numOfDigits;
        int sum = 0;
        int digit;
        int power = 1;

//דבר ראשון-שומרים בתוך משתנה כמה ספרות יש
        if (x < 10) {
            numOfDigits = 1;
        } else if (x > 10 && x < 100) {
            numOfDigits = 2;
        } else if (x > 100 & x < 1000) {
            numOfDigits = 3;
        } else {
            numOfDigits = 4;
        }


//כל עודהמספר שלנו לא אפס רצים עליו -אנחנו מצמצמים אותו בכל פעם עד שהוא יגיע ל0
        while (x != 0) {

//שולפים את סיפרת היחידות שלו
            digit = x % 10;

//רצים לפי מספר הספרות
            for (int i = 0; i < numOfDigits; i++) {
//מכפילים את הספרה בתוצאה
                power = power * digit;
            }
//סוכמים
            sum = sum + power;
//מחלקים את המספר כדי לצמצם אותו
            x = x / 10;
        }

//אם תוצאות החיבור של כל הספרות בחזקת מספר הספרות שווה למספר הבסיסי שקיבלנו-מדפיסים אותו
        if (sum == baseNumber) {
            System.out.println(baseNumber);
            {
            }
        }

    }
}