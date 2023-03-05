package FirstProject;

import java.util.Arrays;

public class Hafta19_20MultiArrays {

    public static void main(String[] args) {

        //multi-arrays
        int            []ages  = {8,6,7,8};

        String         [] mathOgretmenleri = {"John","Temel","Mari","Serkan"};
        String         [] musikOgremtneleri = {"Lale","Khatuna","Priyanka","Sheman"};
        String         [] sportOgremtenleri = {"BruceLee","Tarkan","Heman","Spiderman"};


        String[]       []  okulunOgretmenleri = {mathOgretmenleri,musikOgremtneleri,sportOgremtenleri};


        System.out.println("Arrays.toString(mathOgretmenleri) = " + Arrays.toString(mathOgretmenleri));
        System.out.println("Arrays.toString(musikOgremtneleri) = " + Arrays.toString(musikOgremtneleri));
        System.out.println("Arrays.toString(sportOgremtenleri) = " + Arrays.toString(sportOgremtenleri));

        System.out.println("Arrays.toString(okulunOgretmenleri) = " + Arrays.toString(okulunOgretmenleri));
        System.out.println("Arrays.deepToString(okulunOgretmenleri) = " + Arrays.deepToString(okulunOgretmenleri));


        //odevler:
        //odev1: verilen sayi listesindeki en fazla tekrar eden sayiyi bulma
        //odev2: verilen isimdeki en fazla tekrar eden harfi bulma
        //odev3: https://www.codingame.com/ide/puzzle/temperatures


    }
}
