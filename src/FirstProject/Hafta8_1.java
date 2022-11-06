package FirstProject;

public class Hafta8_1 {

    public static void main(String[] args) {


        System.out.println(" 5 > 4 :" + (5 > 4));
        System.out.println(" 5 < 4 :" + (5 < 4));
        System.out.println(" 5 >= 4 :" + (5 >= 4));
        System.out.println(" 5 <= 4 :" + (5 <= 4));
        System.out.println(" 5 == 4 :" + (5 == 4));
        System.out.println(" 5 != 4 :" + (5 != 4));



         int x = 5;
         double y = 4.5;

         String message = "Hello2^&* \n";  //string is a sequence of chars.


         char option = 'Y';

         boolean isBigger = true;
         isBigger = 5 > 4;


         int z = 10;
         x = 4 + 5 - 6 / 5;

         x =  z - 10;
         //ASCII characters:
         //variable assign ederken sag tarafda expression olur.
        // expression: bir sayi, sayilardan olusan bir islem olabilir sayilar ve ayni variable veya baska variable lardan olusmus birislem de olabilir.


        int age = 23 ;
        boolean isCitizen = false;

       boolean isEligible = (age > 18) && isCitizen ;

        System.out.println("isEligible = " + isEligible);

        //  First Logical Operator:  && : and operator

        // True && True = True
        // False && True = False
        // True && False = False
        // False && False = False


        int toplamDersSayisi = 50;
        boolean kaldigiDersVarmi = false;
        double dersNotOrtalamasi = 80 ;

        boolean MezunOlabilirmi = (toplamDersSayisi > 55 ) && kaldigiDersVarmi && (dersNotOrtalamasi > 75);

        System.out.println("MezunOlabilirmi = " + MezunOlabilirmi);




        //ikinci Logical operator : or : veya



        boolean surucuKursunaGittimi = false;
        boolean okuldaKursagittimi = true ;

        boolean ehliyetAlabilirmi =  surucuKursunaGittimi || okuldaKursagittimi;

        System.out.println("ehliyetAlabilirmi = " + ehliyetAlabilirmi);

        // || or operator

        // True || False = True
        // FALSe || TRUE = TRUE
        // TRUE || TRUE = TRUE
        // FALSE || FALSE = FALSE





        //github, hackerrank, leetcode
        //unary operators:
        // + , - , / * , % : binary operators:   5 + 4       60 / 8
        //unary operator:  + : 1- addition , 2- concatenation , 3- unary plus operator

        // Shorthand operators:

        //Logical operators: true veya false ile islem yapmamiza yariyor.


        // 5! = 1 * 2 * 3 * 4 * 5



        int hesap = 1008;
        System.out.println("hesap = " + hesap);

        hesap =  hesap + 10;

        System.out.println("hesap = " + hesap);


        hesap += 10;

        System.out.println("hesap = " + hesap);




        //unary operators:
        // ++ ve --
        int gunlukHarcklik = 10;
      //  gunlukHarcklik = gunlukHarcklik + 1 ;

       // gunlukHarcklik += 1 ;

        gunlukHarcklik++;

        System.out.println("gunlukHarcklik = " + gunlukHarcklik);


        gunlukHarcklik--;

        System.out.println("gunlukHarcklik = " + gunlukHarcklik);

        ++gunlukHarcklik;

        System.out.println("gunlukHarcklik = " + gunlukHarcklik);






    }
}
