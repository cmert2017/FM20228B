package FirstProject;

public class Hafta14_2_Loops {

    public static void main(String[] args) {

        //Loops

        /*
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

         */


        for (int i = 0; i < 5; i++) {

            System.out.println("Hello World");

        }

        System.out.println("-----------------");

        for (int i = 10; i < 15; i++) {

            System.out.println("Hello World");

        }


        System.out.println("----");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("----");


        System.out.println("**********************");

        System.out.println("----");

        for (int i = 0; i < 10; i++) {
            System.out.println("|   |");
        }

        System.out.println("----");


        System.out.println("*******************");


        for (int i = 10; i > 5; i--) {

            System.out.println("Hello World");

        }


        System.out.println("***--*****");
        //i = 5;
        //i--      i = i -1 ;
        //      i = i - 2 ;

        for (int i = 0; i < 10; i = i + 2) {

            System.out.println("Hello");

        }


        //loopun ikinci kullanisi
        //1den 100e kadar olan sayilari yaziniz.


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);


        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------//--------------");
        //1den 100e kadar olan cift sayilari bastiriniz

        for (int i = 2; i < 101; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("----+++++++------");
        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0) {
                System.out.print(i+ "**");
            }
        }





    }
}
