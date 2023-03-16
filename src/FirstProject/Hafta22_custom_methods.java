package FirstProject;

import java.util.Scanner;

public class Hafta22_custom_methods {


    public static void main(String[] args) {

        //bir sayinin herhangi bir kuvvetine bulan bir metod yaziniz
        //metod: islem yapar. action.

        greeting();

       // String name = tellMeYourName();
        //System.out.println("your name is " + name);

        //NthPower();



        NthPower(2,5);
        NthPower(10,3);
        //int sum = sumOfTwoNumber(7,3);
        //System.out.println("The sum of the numbers from outside the method " + sum);





    }

    private static int sumOfTwoNumber(int x, int y) {

        int sum = x + y;
        System.out.println("the sum of the numbers from inside the method is" + sum);

        return sum;
    }

    public static void NthPower(){

    }

    private static void NthPower(int a, int n) {

        int result = 1;

        for (int i = 0; i < n; i++) {
            result = result * a;

        }

        System.out.println("the " + n + "th power of " + a + " is " + result);

    }


    private static void greeting() {
        System.out.println("Hello");
    }

    private static String tellMeYourName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your name:");
        // String name = input.next();

        return input.next();
    }





    //hw1://nth power methodunu negative sayilar icinde yapiniz
    //hw2: ayni class in icinde
    // 1-kullaniciya once kac tane sayi girmek istedigini soran bir method yaziniz
    // 2- ondan sonrada o sayilari girmesini isteyen bir method yaziniz
    // 3- sonrada o sayilarin max bulan method yaziniz
    // 4-ve min larini bulan  method yaziniz.



}
