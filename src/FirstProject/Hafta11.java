package FirstProject;

import java.util.Scanner;

public class Hafta11 {


    public static void maxNumberOf2Numbers() {
        //1-Kullanici tarafindan girilen iki sayidan buyugunu bulan bir program yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("iki tane sayi giriniz: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();


        //process
        if (num1 > num2) {

            System.out.println(num1 + " is bigger than " + num2);

        } else if (num1 < num2) {

            System.out.println(num1 + " is less than " + num2);

        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

    }

    public static void remainder5() {
        Scanner input = new Scanner(System.in);
        // verilen bir sayinin 5'e bolunumunden kalan sayiyi bulunuz
        System.out.println("bir sayi giriniz: ");
        int sayi = input.nextInt();

        if (sayi % 5 == 0) {

            System.out.println(sayi + "is divisible by 5");
        } else {
            System.out.println(sayi + "is NOT divisible by 5");

        }

    }

    public static void remainder5_2() {
        Scanner input = new Scanner(System.in);

        // verilen bir sayinin 5'e bolunumunden kalan sayiyi yazdiriniz
        System.out.println("bir sayi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println(sayi1 + "5'e bolumunden kalan" + sayi1 % 5);

        //gereksiz
        if (sayi1 % 5 == 0) {
            System.out.println(" kalan: 0");
        } else if (sayi1 % 5 == 1) {
            System.out.println(" kalan: 1");
        } else if (sayi1 % 5 == 2) {
            System.out.println(" kalan: 2");
        } else if (sayi1 % 5 == 3) {
            System.out.println(" kalan: 3");
        } else {
            System.out.println(" kalan: 4");
        }


    }

    public static void maxOfGiven3Numbers() {
        Scanner input = new Scanner(System.in);
        //- Kullanici tarafindan girilen uc sayidan en buyugunu bulan bir program yaziniz.
        System.out.println("3 sayi giriniz: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        //array-liste
        // int[] arrr= {4,5,6,7,7,8,9,0,5};


        int biggestNumber = 0;


        if (number1 > number2 && number1 > number3) {
            biggestNumber = number1;
        } else if (number2 > number1 && number2 > number3) {
            biggestNumber = number2;
        } else if (number3 > number1 && number3 > number1) {
            biggestNumber = number3;
        }


        System.out.println("En buyuk sayi:" + biggestNumber);

    }


    public static void maxOfGiven3Numbers2() {
        Scanner input = new Scanner(System.in);
        //- Kullanici tarafindan girilen uc sayidan en buyugunu bulan bir program yaziniz.
        System.out.println("3 sayi giriniz: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        //array-liste
        // int[] arrr= {4,5,6,7,7,8,9,0,5};


        int biggestNumber = 0;




        System.out.println("En buyuk sayi:" + biggestNumber);

    }



    public static void main(String[] args) {

        //gecen hafta:
        //if
        // if - else
        //if - else if - else if ... -else
        //ornek: kullanici sayi girecek bizde onun adini yazdiracaz.

        //if de conditional lari kontrol ediyoruz.
        // conditional larda: relational operator  kullanilarak elde edilir: < , > , <=, >= , !=, ==
        //complex conditionalida logical operatorlar ile elde ediyoruz.
/*
        {
            int x = 4;

            if (x == 0) {
                System.out.println("Zero");

            } else if (x == 1) {
                System.out.println("One");
            }
        }

*/
        //girilen sayinin


        Scanner input = new Scanner(System.in);

        maxNumberOf2Numbers();

        remainder5();

        remainder5_2();

        maxOfGiven3Numbers();


        //nested if can be analyzed easily  in flow-charts




    }

}