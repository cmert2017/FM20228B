package FirstProject;

public class Hafta16_3_Arrays {


    public static void main(String[] args) {


     //Array

        //kullanicidan haftanin gunlerini alip ekrana yzan bir program yapiniz

      //  Scanner input = new Scanner(System.in);

    //    System.out.println("Haftanin gunlerini yaziniz");
/*
        String day1= input.next();
        String day2= input.next();
        String day3= input.next();
        String day4= input.next();
        String day5= input.next();
        String day6= input.next();
        String day7= input.next();

        System.out.println("day1 = " + day1);
        System.out.println("day2 = " + day2);
        System.out.println("day3 = " + day3);
        System.out.println("day4 = " + day4);
        System.out.println("day5 = " + day5);
        System.out.println("day6 = " + day6);
        System.out.println("day7 = " + day7);


 */

        int benimSayim = 6;
        int[] benimSayilarim = new int[5];

        //

       // String myArray = new String();
        String[] myArray2 = new String[7];

        myArray2[0] = "Ptesi";
        myArray2[1] = "Sali";
        myArray2[2] = "Carsa";
        myArray2[3] = "Pers";
        myArray2[4] = "Cum";
        myArray2[5] = "Ctesi";
        myArray2[6] = "Pazar";


        System.out.println("myArray2[0] = " + myArray2[0]);
        System.out.println("myArray2[1] = " + myArray2[1]);
        System.out.println("myArray2[2] = " + myArray2[2]);
        System.out.println("myArray2[3] = " + myArray2[3]);
        System.out.println("myArray2[4] = " + myArray2[4]);
        System.out.println("myArray2[5] = " + myArray2[5]);
        System.out.println("myArray2[6] = " + myArray2[6]);

        System.out.println("ayni seyi loopla yazdirma");
        for (int i = 0; i < 7; i++) {

            System.out.println("myArray2[" + i + "] = " + myArray2[i]);

        }


        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");


    }
}
