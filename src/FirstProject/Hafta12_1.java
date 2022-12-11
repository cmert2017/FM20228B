package FirstProject;

public class Hafta12_1 {


    public static void main(String[] args) {

        //eger if den sonra sadece bir statement kullanacaksaniz {} e gerek yok.

        int x = 5;
        String cevap = "";


        if (x % 2 == 0)
            cevap = x + " is even number";
        else
            cevap = x + "is an odd number";


        System.out.println(cevap);

        //ikinci ornek
        boolean paramizvarmi = true;
        boolean yagmuryagiyormu = false;
        boolean piknikegidelimmi = paramizvarmi && yagmuryagiyormu;
        //asagidkai if blokunda sadece ilk print if bloguna aittir.
        if (piknikegidelimmi)
            System.out.println("evet piknige gidiyoruz");
        System.out.println("yemekleri hazirlayalim");
        System.out.println("biriside esyalari arabaya yuklesin");
        System.out.println("haritada uzakliga bakip benzin yetecekmi biriside bunu kontrol etsin");


        // ternary operator


        //if else blogunu kissaltabilirmiyiz. Evet ternary operator ile.

        String cevap2 = x % 2 == 0 ? x + "sayimiz ciftir" : x+ "sayimiz tekdir";

        System.out.println("cevap2 = " + cevap2);


        //switch operator


        int a = 5;


        if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a == 3) {
            System.out.println("Three");
        } else if (a == 4) {
            System.out.println("four");
        } else if (a == 5) {
            System.out.println("five");
        } else if (a == 6) {
            System.out.println("six");
        }


        switch (a) {

            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Invalid Case");

        }


        String productName = "iphone";

        switch (productName) {

            case "galaxy":
                System.out.println("Samsung");
                break;

            case "iphone":
            case "ipad":
            case "MacBook":
                System.out.println("Apple");
                break;

        }



        //600 kelime / dakika  beynin calisma prensipleri veya kapasitesi
        //100-200 400


        //String : list of chars
        //char : harf
        //string: kelimeler/cumleler

        //rakam:
        // sayi: rakamlardan olusur




        String firstname = "George";
        String lastname = "Tevzadze";


        char firstLetter = firstname.charAt(0);
        System.out.println("firstLetter = " + firstLetter);


    }

}
