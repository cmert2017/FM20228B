package FirstProject;

public class Hafta16_loops_NestedLoops_Arrays {


    public static void main(String[] args) {

//1-a for loop kullanarak 1den 100e kadar 5in katlari olan sayilarin toplamini bulduran bir program yaziniz.

        /*
        //fori yi secerek Intellij in sundugu template(sablon) u kullana bilirsiniz
        for (int i = 0; i < ; i++) {

        }

         */

        int toplam = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                toplam = toplam + i;
            }

        }

        //1 + 2+ ...+ 99 + 100 = 100 * (100 + 1) / 2 = 50 * 101 = 5050
        //1 + 2+ ...       + n = n * (n + 1) / 2

        System.out.println("toplam = " + toplam);


        //for loop un dgisik yazilisi
        int i = 1;

        for (; i <= 100; ) {

            if (i % 5 == 0) {
                toplam = toplam + i;
            }
            i++;

        }


//1-b- while loop kullanarak 1den 100e kadar 5in katlari olan sayilarin toplamini bulduran bir program yaziniz.

        int j = 1;
        int toplam2 = 0;
        while (j <= 100) {

            if (j % 5 == 0) {
                toplam2 = toplam2 + j;
            }
            //   System.out.println("j = " + j);
            j++;
        }

        System.out.println("toplam2 = " + toplam2);


        //1-c- do-while loop kullanarak 1den 100e kadar 5in katlari olan sayilarin toplamini bulduran bir program yaziniz.

        //35 gece bir grubu dinliyecez

        int k = 1;
        int toplam3 = 0;
        do {
            if (k % 5 == 0) {
                toplam3 = toplam3 + k;
            }
            k++;
        } while (k <= 100);


        System.out.println("toplam3 = " + toplam3);

    //2 - write a program that can divide two numbers without using / and  % operators
    // and retruns the division and remainder


//           11 / 4 = 2 remainder 3   ---> 11 = 4 * 2 + 3
        int division = 11 / 4 ;
        int remainder = 11 % 4 ;

        //    4 + 4 + 3 = 11
        //   bolunen = 11
        //   bolunen = 11 - 4
        //   bolunen = 7
        //   bolunen = 7 - 4
        //   bolunen = 3

        int bolunen = 11;
        int bolen = 4;

        int count = 0;

        while(bolunen >= bolen){

            bolunen = bolunen - bolen;
            count++;
        }


        System.out.println(count+" with a remainder of "+bolunen);


    }


}
