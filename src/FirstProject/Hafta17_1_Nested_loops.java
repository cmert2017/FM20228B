package FirstProject;

public class Hafta17_1_Nested_loops {


    public static void main(String[] args) {

/*
        for (int i = 0; i < 6; i++) {


            System.out.println("*");


        }



 */



       // System.out.println("*");

/*

        System.out.println("* * * * * *");


        for (int i = 0; i < 6; i++) {
            System.out.print("* ");
        }


 */

        //1.adim: i yi declare ve initiaze ediyor. ve bunu bir kere yapar. bir daha hic yapmaz.

        //2. adim: i yi kontrol ediyor. i < 6, eger dogruysa sonrkaiadima geciyor
        //3. adim: loop un body kismina gidip tum icerdeki line lari execute ediyor.
        //4. adim: indexi yani i harfini arttirma yada azaltma yapar ve ikinci adima gider.


/*

        for (int i = 0 ; i < 6; i++) {


            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }


 */

        //karenin ust kismindaki dik ucgeni yazdirin.
        for (int i = 0 ; i < 6; i++) {


            for (int j = 0; j < 6; j++) {
                if(i<=j) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }

            System.out.println();

        }





    }





}
