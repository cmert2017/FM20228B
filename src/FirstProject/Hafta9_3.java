package FirstProject;

import java.util.Scanner;

public class Hafta9_3 {

    public static void main(String[] args) {

        //even or odd number
        //Bu biizm MVP miz.
        //if-else blogu
        Scanner input = new Scanner(System.in);


        String result = null;
        int girilenSayi;


        //input
        System.out.println("Donem ortalamanizi giriniz: ");
        girilenSayi = input.nextInt();

        //process: even or odd
        if(girilenSayi >= 85){  //80
            result = "Takdir aldiniz";
        }else if (girilenSayi >= 70){   //compiler sunu ogrendi : girilenSayi < 85
            result = "Tesekkur aldiniz";
        } else if (girilenSayi >= 50) {
            result = " sadece karne aldiniz";
        } else {
            result = "Malesef sinif tekrari hakki kazandiniz";
        }


        //output
        System.out.println("Donem sonu durumunuz: " + result);


    }
}
