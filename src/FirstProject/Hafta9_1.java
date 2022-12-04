package FirstProject;

import java.util.Scanner;

public class Hafta9_1 {
    public static void main(String[] args) {

        //even or odd number
        //Bu biizm MVP miz.
        //if-else blogu
        Scanner input = new Scanner(System.in);


        String result = null;
        int girilenSayi;


        //input
        System.out.println("Bir sayi girin: ");
        girilenSayi = input.nextInt();

        //process: even or odd
        if(girilenSayi%2==0){
            result = "Even";

        }else {
            result = "Odd";
        }


        //output
        System.out.println("Girdiginiz sayi: " + result);





    }
}
