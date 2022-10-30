package FirstProject;

import java.util.Scanner;


public class Hafta7 {

    public static void myNewMethod(){
        System.out.println("Hello my first method out of main");
    }

    public static void sumof2Numbers(){

    }

    public static void orderingGivenNumbers(){

    }

    public static void main(String[] args) {

        int uzunluk;
        int genislik;
        int alan;
        int perimeter;


        //myNewMethod();

        Books book1 = new Books();
        Clients client1 = new Clients();







        String firstName =  "FB";
        String lastname = "School";

        String brand = new String();
        brand = "BMW";


        int x;
        x = 5;
        System.out.println(x); //x =5
        x = 25;
        System.out.println(x); //x =25
        double y;
        char t;
        boolean isWorking;



        //programlamanin temelleri veya programlamaya giris
        // arithemetic operators
        // variables
        // logical operators
        // conditionals
        //loops


        // Object Oriented programing
        //classes and methods


        //advanced programming

/*
        System.out.println("Enter your company name: ");


        String companyName =    scan.next();

        System.out.println("Your company name: " +companyName);


 */

      //  System.out.println("Enter your age: ");

     //   int age =  scan1.nextInt();

    //    System.out.println("your age is\t" + age);
     //   System.out.println("After ten years your age will be " + (age + 10));

        //ilk 24 saat icinersinde tekrar yapmazsaniz yuzde 80 koyunu unutuyorsunuz. so smart study not hard study


        System.out.println("***************Hafta6 nin odev couzmleri************");

        Scanner scan1 = new Scanner(System.in);

        //input data
        System.out.println("Dikdortgenin uzunlugunu giriniz: ");
        uzunluk = scan1.nextInt();

        System.out.println("Dikdortgenin genisligi giriniz: ");
        genislik = scan1.nextInt();



        //processing data
        alan = uzunluk * genislik ;
        perimeter = 2 * (uzunluk +genislik );


        //output data
        System.out.println("alan = " + alan);
        System.out.println("perimeter = " + perimeter);


        System.out.println("********ikinci sorunun cozumu*********");
        //int sayi = 657;  //6+2+3 = 11

        System.out.println("uc basamakli bir sayi giriniz: ");
        int sayi = scan1.nextInt();

       // System.out.println("623 sayisinin rakamlari toplam 11 dir");


        int birinciRakam;
        int ikinciRakam;
        int ucuncuRakam;

       // System.out.println(545.0/100);

        birinciRakam = sayi / 100;
        ikinciRakam = (sayi / 10 ) % 10;
        ucuncuRakam =  sayi % 10;

        System.out.println("birinciRakam = " + birinciRakam);
        System.out.println("ikinciRakam = " + ikinciRakam);
        System.out.println("ucuncuRakam = " + ucuncuRakam);


        int rakamlarinToplami = birinciRakam + ikinciRakam + ucuncuRakam;

        System.out.println(sayi + " sayisinin rakamlarinToplami = " + rakamlarinToplami);

       // System.out.println("5 + 6 + 7 nin ortalamasi: " + ((5 + 6 + 7) / 3));

        //debugging: hata ayiklama : kod-cu ile software engineer arasinda buyuk fark var.
        //3 tip hata grubu vardir programlamada.
        //birincisi daha ilk basta kod yazarken  yapalin hata.
        //calissirken bir hata veriyor.
        //logic hatasi


        //iki integerin bolumunun sonucu integer dir. java icin.  545 / 100 = 5
        // ama sayilardan birisi decimal ise sonucu decimal verir. 545.0 /100 = 5.45


        System.out.println("********Relational Operators*******");

        // +,-,*, /, %  are  binary operator

        int x1 = 5;
        int x2 = 4;
        int toplam = x1 + x2;
        System.out.println("toplam = " + toplam);

        System.out.println("toplam = "+ (5 + 4));

        System.out.println(5 < 4);// bilgisayar burda bu karsilastirmayi onayliyor. true veya false diyerek.
        // > , <, >=, <= , == are relational operators. relational operator larin sonuclari true veya false dur.
        // note: = is an assignment operator

        int sayi2 = 14;

        boolean isEven =  (sayi2 % 2) == 0 ;

        System.out.println("14 sayisinin 2ye bolumunden kalan: " + (14 % 2));

        int age = 50;
        boolean isEmekli = sayi > 65 ;
        boolean isSleeping = false;

        System.out.println("isEmekli = " + isEmekli);

        System.out.println("********even or odd******");

        System.out.println("Enter a number: ");
        int num = scan1.nextInt();


        boolean isEven1 = ((num % 2) == 0) ;


        System.out.println("is num even  = " +  isEven1);


    }



}
