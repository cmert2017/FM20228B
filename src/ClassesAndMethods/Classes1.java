package ClassesAndMethods;

import java.util.Scanner;

public class Classes1 {

    public static void Introduction(){
        System.out.println("Hello World");
        System.out.println("My Name is John");
        System.out.println("I'm dev");

    }


    public static int sumOf2Numbers(int x, int y){

        return x + y;

    }



    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);


        //input
        System.out.println("Enter first integer number = ");

        int num1 = scanner2.nextInt();

        System.out.println("Enter second integer number = ");

        int num2 = scanner2.nextInt();


       //calculations

        int sum = sumOf2Numbers( 2, 4 );



        //output

        System.out.println("sum = " + sum);


        Introduction();




    }

}
