package FirstProject;

import java.util.Scanner;

public class Hafta13 {

    public Hafta13() {


    }


    /**
     *   bu method kendisine verilen sayinin cift mi yoksa tek mi oldugunu belirler
     *   Ornek: 10 sayisinin 0a bolumunden kalan 0 oldugu icin ciftir
     * @param x
     * @return  String
     */
    public  String evenOdd(int x) //method signature
    {

        return x%2==0 ? "even":"odd";  //method body
    }

    public static void main(String[] args) {

        //meetup grublari: 18 yaz ve uzeri olundugunda java gibi kodlama ile
        // alakali sehrimizdeki grublarin faliyetlerine katilinabilinir veya grub kurabilirsiniz.

        int x = 7;
        Integer y = 5;

        boolean isEligible = true;
        Boolean isHungary = false;

        Scanner input = new Scanner(System.in);

        Hafta13 obj = new Hafta13();
        obj.evenOdd(4);


        Dog dog1 = new Dog();
        dog1.isim = "Pasa";
        dog1.yas = 5;
        dog1.rengi = "siyah";
        dog1.eat();
        dog1.sleep();



        //String

        String firstName = "John"; //camel case


        String LastName = "Smith"; //pascal case

        String eye_color = "brown";   //snake case

        String bosluk = " ";


        System.out.println(firstName + LastName);
        System.out.println(firstName + " " + LastName);
        System.out.println(firstName + bosluk + LastName);
        System.out.println("John Smith");

        System.out.println(firstName + LastName);
        System.out.println(firstName + " " + LastName);
        System.out.println(firstName + bosluk + LastName);
        System.out.println("John Smith");

        firstName.charAt(0); //j
        firstName.charAt(1); //o
        firstName.charAt(2); //h
        firstName.charAt(3); //n
        //firstName.charAt(4); //?= this gives an index out of boundry error

        //memory management - usage

        //stack and heap memory
        // Upwork: 3 interview -

       // System.out.println(evenOdd(10));

        //hata(yanlis) tipleri
        // syntax error-->grammer hatasi --daha kodu yazarken compiler bize hatayi gosteriyor
        // run-time : programi calistirinca ortaya cikan hata
        //  logic error:

        int std1 = 11;
        int std2 = 12 ;
        int std3 = 10;


        int average = std1 + std2 + std3 / 3 ;   //burada logic hatasi
        int average1 = (std1 + std2 + std3) / 3 ;

        System.out.println(average);


        //firstName

        LastName.charAt(0);

        System.out.println(firstName.charAt(0) + LastName.charAt(0)); //157
        System.out.println(firstName.charAt(0) + " " +LastName.charAt(0)); // J S
        System.out.println(firstName.charAt(0) + "" +LastName.charAt(0)); // J S

        System.out.println("John" + "Smith"); //concatenation : yapistir
        System.out.println('A');
        System.out.println('J' +'S' ); //J--> 74   S--> 83 = 157


        System.out.println(firstName.charAt(0)); //157

        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = LastName.charAt(0);

        //problem niye? cunku + islemi char lari yapistirmiyor yerine onlarin ASCII table daki numeric degerleini topluyor
        System.out.println(firstNameInitial + lastNameInitial);//157

        //alternatif cozum
        System.out.print(firstName.charAt(0));
        System.out.println(LastName.charAt(0));

        //A ---> 65  ----> 00001001 ----> 0v0v0v0v5v

        //charterleri --->decimal--->binary---> volt(akim geciyor)

        char ilkKarakterilkismin = firstName.charAt(0);
        char ilkkarakterSoyisim = LastName.charAt(0);

        System.out.println(ilkKarakterilkismin + " " ); //


        //method

        System.out.println("firstName.toLowerCase() = " + firstName.toLowerCase());
        System.out.println("firstName.toUpperCase() = " + firstName.toUpperCase());

        System.out.println("firstName.isEmpty() = " + firstName.isEmpty()); //false

        System.out.println("firstName.concat(\" Mehmet\") = " + firstName.concat(" Mehmet"));

        //pshing bir hacking methodu

        //sosyal medyada nick name


        System.out.println("firstName.equals(\"John\") = " + firstName.equals("John"));

        //basit data tiplerinde karsilastirma == yapilir ama string lerde equals methodu kullanilmali.


        System.out.println("firstName.indexOf(\"n\") = " + firstName.indexOf("n"));
        System.out.println("firstName.length() = " + firstName.length());
        System.out.println("Passwordu giriniz");
        String passowrd = input.next();

        if(passowrd.length()< 8){
            System.out.println("password un uzunlugu 8den kcuuk olamaz");
        }

        //8 den buyuk olsun
        //buyuk harf harf
        //sayi olsun
        //ozel karakter






    }
}
