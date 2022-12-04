package FirstProject;

import java.util.Scanner;

public class Hafta10 {


    public static void main(String[] args) {

        //if conditional
        //if-else

        House ev1;
        House ev2;

        //BreakPoint: progrmain execution ini durduma noktasi
        //if-else if - else if ... -else

        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        String result = "";

        //(): round parenthesis (braces)
        // {}: curly parenthesis (braces)
        //[]: square paranthesis (braces)
        //relational operators: >, <, >= ,<= , == , !=
        // && , || : logical operators
        if(grade >= 90){
            result = "A";
        }else if(grade >= 80){
            result = "B";
        }else if(grade >= 70){
            result = "C" ;
        }else if (grade >= 60){
            result = "D";
        }else{
            result = "F";
        }


        //CPU: amazimiz az enerji ile maksimum guc elde etmek.
        //CPU: yani az islem ile sonuca ulasmak.
        //hafizada ki yerin optimizasyonu ve hizin optimizasyonu
        //time complexity and space complexity: 1- intr to programming -> 2-data structures and algorithms

        //ilk 24 saat incinde tekrar edilmeyen bilgilerin yuzde 80.
        //dunya hafiza sampiyon melih safi duyar:
        //not hard work but smart work.


        if(grade > 70 && grade < 80){

        }

        

        System.out.println("result = " + result);


        //bu hafta nested if i gorucez.




    }
}
