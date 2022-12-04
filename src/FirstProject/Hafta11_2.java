package FirstProject;

import java.util.Scanner;

public class Hafta11_2 {


    public static int maxNumberOf2Numbers(int num1,int num2) {

        int biggestNumber = 0;
        //process
        if (num1 > num2) {

           biggestNumber = num1;

        } else if (num1 < num2) {

            biggestNumber = num2;

        } else {
            biggestNumber = num2;
        }

        return biggestNumber;
    }


    public static void main(String[] args) {

        //1-Kullanici tarafindan girilen iki sayidan buyugunu bulan bir program yaziniz.

        //input
        Scanner input = new Scanner(System.in);

        System.out.println("iki tane sayi giriniz: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();


        //process
        //test1: birinci sayi buyuk
        num1 = 6;
        num2 = 10;
        //int maxSayi = maxNumberOf2Numbers(num1,num2);
        System.out.println("maxNumberOf2Numbers(num1,num2) = " + maxNumberOf2Numbers(num1, num2));

        num1 = 6;
        num2 = 8;
        //test2: ikinci sayi buyuk
        //int maxSayi2 = maxNumberOf2Numbers(num1,num2);
        System.out.println("maxNumberOf2Numbers(num1,num2) = " + maxNumberOf2Numbers(num1, num2));


        num1 = 6;
        num2 = 6;
        //test3: sayilar birbirine esit
       //int maxSayi3 = maxNumberOf2Numbers(num1,num2);
        System.out.println("maxNumberOf2Numbers(num1,num2) = " + maxNumberOf2Numbers(num1, num2));

        //System.out.println("maxSayi = " + maxSayi);



        //max(num1, num2, num3)=?
        // int sayi = maxNumberOf2Numbers(num1, num2)
        // maxNumberOf2Numbers(sayi,num3)


    }
}
