package FirstProject;

import java.util.Scanner;

public class Hafta16_4_Arrays2 {


    public static void main(String[] args) {


     //Array

        //kullanicidan haftanin gunlerini alip ekrana yzan bir program yapiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Haftanin gunlerini yaziniz");

        String[] myArray2 = new String[7];


        for (int i = 0; i < 7; i++) {

            myArray2[i]= input.next();

        }

/*
         myArray2[0]= input.next();
         myArray2[1]= input.next();
         myArray2[2]= input.next();
         myArray2[3]= input.next();
         myArray2[4]= input.next();
         myArray2[5]= input.next();
         myArray2[6]= input.next();

 */
        for (int i = 0; i < 7; i++) {

            System.out.println("myArray2[" + i + "] = " + myArray2[i]);

        }


        //sinifdaki arkadaslarinizin adlarini giriniz ve ekrana yazdiriniz.

    }
}
