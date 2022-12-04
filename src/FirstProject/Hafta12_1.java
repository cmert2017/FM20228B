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

        String cevap2 = x % 2 == 0  ? " sayimiz siftir"   :   "sayimiz tekdir" ;

        System.out.println("cevap2 = " + cevap2);




        //swicth operator


        


    }


}
