package FirstProject;

import java.util.Scanner;

public class Hafta12 {


    public static int maxNumberOf2Numbers(int num1,int num2) {
        //1-Kullanici tarafindan girilen iki sayidan buyugunu bulan bir program yaziniz.
        //process
        int cevap = 0;
        if (num1 > num2) {

            cevap = num1;

        } else if (num1 < num2) {

            cevap = num2;

        } else {
            cevap = num1;
        }

        return cevap;
    }


    public static void main(String[] args) {

    //verilen 3 sayidan en buyugunu bulunuz

        //input
        Scanner input = new Scanner(System.in);

        System.out.println("Uc tane sayi giriniz: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        //process & output
      //int araCevap = maxNumberOf2Numbers(num1,num2);

      //int sonCevap = maxNumberOf2Numbers(araCevap, num3);

        System.out.println("sonCevap = " + maxNumberOf2Numbers(maxNumberOf2Numbers(num1,num2), num3));




    }
}
