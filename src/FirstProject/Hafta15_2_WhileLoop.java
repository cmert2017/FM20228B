package FirstProject;

import java.util.Scanner;

public class Hafta15_2_WhileLoop {

    public static void main(String[] args) //head - signature
    { //body

        //kullanicinin girdigi sifreyi kontrol eden bir program

        Scanner input = new Scanner(System.in);
 /*
        System.out.print("Sifrenizi giriniz: ");


        String girilenSifre = input.next();
        String gercekSifre = "123abc";


        while (!(girilenSifre.equals(gercekSifre))) {
            System.out.println("Yanlis sifre girdiniz");
            System.out.println("sifreyi tekrar deniyiniz");
            girilenSifre = input.next();
        }

        System.out.println("Dogru sifreyi girdiniz tebrikler");

         */

/*
        //Do-while loop
        String gercekSifre = "123abc";
        String girilenSifre = "";

        do {
            System.out.print("Sifrenizi giriniz: ");
            girilenSifre = input.next();
        } while (!girilenSifre.equals(gercekSifre));

        System.out.println("Dogru sifreyi girdiniz tebrikler");

*/
        // Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

        int girilenSayi = 0;
        int toplam = 0;

        do {

            toplam = toplam + girilenSayi;
            System.out.print("sayi giriniz: ");
            girilenSayi = input.nextInt();

        } while (girilenSayi >= 0 );


        System.out.println("Girilen sayilarin toplami = " + toplam);






    }


}
