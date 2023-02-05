package FirstProject;

import java.util.Arrays;

public class Hafta18_arrays {

    public static void main(String[] args) {

        //
        //arraytutils: 24:1


        int[] matScores2 = {80, 90, 100, 50, 130, 100, 10, 40, 80, 100,10};
        int[] matScores3 = {};

        //bu arrayin elemanlarini nasil ekrana yazdiririz

        System.out.println(matScores2);

        for (int i = 0; i < matScores2.length; i++) {
            System.out.print(matScores2[i] + " ");
        }
        System.out.println();
        System.out.println("Arrays.toString(matScores2) = " + Arrays.toString(matScores2));
        System.out.println("Arrays.toString(matScores3) = " + Arrays.toString(matScores3));

        Arrays.sort(matScores2);
        System.out.println("Arrays.toString(matScores2) = " + Arrays.toString(matScores2));
        System.out.println("Arrays.stream(matScores2).min() = " + Arrays.stream(matScores2).min());


        //pseudocode : sozde kod

        // initiliza a varible with mathScores2[0]
        //loop through all the elements
        //and compare with the min
        //if the element we compare is smaller then assign it as min


        int minElement = matScores2[0];

        for (int i = 0; i < matScores2.length; i++) {

            if (minElement > matScores2[i]) {
                minElement = matScores2[i];

            }

        }

        System.out.println("minElement = " + minElement);

        // en az 10 isimden olucan bir array tanimlayin
        // a- arraydaki en uzun ismi
        //b- en kissa ismi bulun


        String[] names = {"Ahmet", "kenan", "lale", "Mehmet"};


        //String enkissaIsim = "Ali"; //boyle hard coded yapmak bug uretir.
        String enkissaIsim = names[0]; //boyle hard coded yapmak bug uretir. o yuzen dynamic yapmaliyiz.

        for (int i = 0; i < names.length; i++) {

            if (enkissaIsim.length() > names[i].length()) {
                enkissaIsim = names[i];
            }

        }


        System.out.println("enkissaIsim = " + enkissaIsim);


        //verilen isim listesindeki tum en kissa isimleri bulunuz.
        String[] names2 = {"Ahmet", "kenan", "lale", "John", "Mehmet"};
        String[] enkissaisimler = new String[names2.length];

        String enkissaIsim2 = names2[0];

        int j = 0;
        for (int i = 0; i < names2.length; i++) {

            if (enkissaIsim2.length() >= names2[i].length()) {
                enkissaIsim2 = names2[i];
                enkissaisimler[j] = enkissaIsim2;
                j++;
            }

        }

        System.out.println(Arrays.toString(enkissaisimler));

        System.out.println("enkissaIsim2 = " + enkissaIsim2);


        //
        String[] names3 = {"Ahmet", "kenan", "lale", "John", "Mehmet"};

        String enkissaIsim3 = names3[0];

        int enkissaisminuzunlugu = 0;
        String enkissaisimler2 = "";

        for (int i = 0; i < names3.length; i++) {

            if (enkissaIsim3.length() > names3[i].length()) {
                enkissaisminuzunlugu = names3[i].length();
            }
        }
        System.out.println("enkissaisminuzunlugu = " + enkissaisminuzunlugu);


        for (int i = 0; i < names3.length; i++) {

            if (names3[i].length() == enkissaisminuzunlugu) {
                enkissaisimler2 += names3[i] + " ";
            }

        }

        System.out.println("enkissaisimler2 = " + enkissaisimler2);


        //yukardaki cozumu cozumun yazdirilma kisminda array kullanma
        //
        String[] names4 = {"Ahmet", "kenan", "lale", "John", "Mehmet"};

        String enkissaIsim4 = names4[0];

        int enkissaisminuzunlugu1 = 0;

        String[] enkissaisimler1 = new String[names4.length];

        for (int i = 0; i < names4.length; i++) {

            if (enkissaIsim4.length() > names4[i].length()) {
                enkissaisminuzunlugu1 = names4[i].length();
            }
        }
        System.out.println("enkissaisminuzunlugu1 = " + enkissaisminuzunlugu1);

        int k = 0;
        for (int i = 0; i < names4.length; i++) {

            if (names4[i].length() == enkissaisminuzunlugu1) {
                enkissaisimler1[k] = names4[i];
                k++;
            }

        }


        //string lerdeki method lari hatirliyalim
        String name = "Mehmet";

        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i) + " ");
        }


        //verilen bir cumledeki kelime sayisini bulunuz

        String cumle = "Bugun-hava-cok-guzel";


        String[] cumleninKelimeleri = cumle.split("-");


        //String[] cumleninKelimeleri = cumle.split(" ");
        System.out.println();

        System.out.println("cumleninKelimeleri arrayinde " + cumleninKelimeleri.length + " tane kelime vardir");
        System.out.println();

        System.out.println("Arrays.toString(cumleninKelimeleri) = " + Arrays.toString(cumleninKelimeleri));



        //verilen kelimedeki karakter sayisini bulalim

        String sehir = "Istanbul";

        System.out.println("sehir.length() = " + sehir.length());

        //verilen kelimedeki karakterleri bastirin

        String sehir2 = "Tiflis";

        char[] sehirkelimesindekikarakterler = sehir2.toCharArray();
        //option enter ile kullanilabilecek methodlari gostertmek
        char[] chars = sehir2.toCharArray();


        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));




        //odev1: verilen sayi listesindeki en fazla tekrar eden sayiyi bulma
        //odev2: verilen isimdeki en fazla tekrar eden harfi bulma












    }


}







