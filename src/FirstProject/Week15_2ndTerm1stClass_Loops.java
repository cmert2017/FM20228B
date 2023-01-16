package FirstProject;

import java.util.Scanner;

public class Week15_2ndTerm1stClass_Loops {




    public static void main(String[] args) {


    //kissa bir tekrar:
    // ekrana yazi yazdirma
    //islemler
    //data tipleri
   //variable tanimlama
   //loops: for loop


        //first example:
        /*
   write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050

            input: 50
            output: 1275
 */

/*
        for (int i = 1; i < 101; i++) {
            System.out.print(i+ " ");

            if(i % 10 == 0) {
                System.out.println();
            }

        }*/




        //input
        Scanner input =  new Scanner(System.in);
        int givenNumber = input.nextInt();


        //process
        int toplam = 0;
        for (int i = 1; i <= givenNumber; i++) {

            toplam = toplam + i;

        }


        //output
        System.out.println(toplam);


        //1--> n =   n (n+1) /2    <--gauss




        //Write a program that will print out all Capital letters in English alphabet in ascending order

/*
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");

 */


        for (int i = 33; i <= 126; i++) {

            System.out.print((char)(i)+ " ");
        }


/*

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            System.out.print(ch+ " ");
        }

*/



    }


}

/*

public class Cat{

    //ozelliklerini tanimliyoruz
    String name = "" ;
    int age = 34;




    //canli olmasi iicn haret etmesi lazim onun icinde actions
    drink(parameter)
    {

    }

    Cat kedi1 =
    Cat kedi2 =
}*/
