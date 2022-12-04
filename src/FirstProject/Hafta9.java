package FirstProject;

import java.util.Scanner;

public class Hafta9 {


    public static void main(String[] args) {

        boolean x = false, z = true;
        int y = 20;
        x =  (y!=10) || (z==false);


       // condition logical condition

        // condition relational operator lr ile olusturulur.

        //Guess what will be the value of x?

        System.out.println("x = " + x);

        //task0:  variable assignment: https://www.codewars.com/kata/50ee6b0bdeab583673000025
        //task1:condition:  https://www.codingame.com/training/easy/power-of-thor-episode-1
        //task2: condition: https://www.codewars.com/kata/5808dcb8f0ed42ae34000031


        //even or odd number
        //Bu biizm MVP miz.
        //if blogu
        Scanner input = new Scanner(System.in);


        String result = null;
        int girilenSayi;


        //input
        System.out.println("Bir sayi girin: ");
        girilenSayi = input.nextInt();

        //process: even or odd
        if(girilenSayi%2==0){
           result = "Even";

        }


        if(girilenSayi%2!=0){
            result = "Odd";
        }



        //output
        System.out.println("Girdiginiz sayi: " + result);





    }
}
