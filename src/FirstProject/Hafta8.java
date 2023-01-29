package FirstProject;

import java.util.Scanner;

public class Hafta8 {


    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz: ");
        num1 = scanner.nextInt();

        System.out.println("ikinci sayiyi giriniz: ");
        num2 = scanner.nextInt();



        boolean isBigger = num1 > num2;


        System.out.println("is num1 bigger than num2: " + isBigger );

        //introduction to Programming
        //Setups & Subscriptions: IDE : intelliJ ; Github ;
        //proje setup : how to create a project in IntelliJ
        // Proje yapisi: Projenin adi / src folder / packages / class /  methods
        // bizim ilk programlarimiz hep main methodun icinde yazilacak
        // first program: How to print to Terminal: Hello World with the help of println method.
        // metodlari ikiye ayirabiliriz: built-in methods, user defined methods.
        //bir program 3 ana basanmak var: input , process , output
        //println ile alistirmalar: nasil text bastirilir, nasil sayi yazdirilir, islem nasil yaptirilir,
        // nasil ozel karakterler yazdirilir  escape character: \ :   \n : new line    ,  \": double quote bastiriyor
        //\t: tab space koyur
        // 4 artihmetik islem nasil yaptirilir bunu gorduk. islem onceligini gorduk: * ve / arkasindan + ve -
        //mesela carpma ve bolme ayni anda varsa soldan basliyarak onlari yapar.
        //Ayrica parantez varsa ilk oncelik ona  gecer.
        //variables: istedigimiz  veriyi once variables lari koyup sonra islem yaptirip, sonra bastirdik
        //nasil text ile sayilari ayni anda bastiririz. concatenation: by using + sign
        //Relational Operators: > , < . >= , <= , ==, !=


        //input
        int age;
        age = 5;
        int num4 = 6;
        String firstname = "John";
      //  firstname.c


        //process
        int toplam = age + num4;

        //reassign
        age = 10;

        //output
        System.out.println("firstname = " + firstname);
        System.out.println("toplam = " + toplam);
        System.out.println("toplam2 = " + 5 + 7);


        //Relational operators:

        System.out.println(5 > 3); //output : True



    }
}
