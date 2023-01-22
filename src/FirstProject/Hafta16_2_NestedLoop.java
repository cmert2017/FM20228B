package FirstProject;

public class Hafta16_2_NestedLoop {


    public static void main(String[] args) {

    //ici dolu uzunlugu 5 olan kare  cizdiriniz. * kullanarak.
        //*****
        //*****
        //*****
        //*****
        //*****

        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");

// DRY : dont repeat yourself

        System.out.println("ayni kare nin for loop ile yazilisi");

        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }


        System.out.println("ayni karenin print ile yazilisi");

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*\n");
        }


        System.out.println("ayni karenin ic ice iki loop ile yazilisi : nested loop ");
        //outer loop
        for (int i = 0; i < 5; i++) {

            //inner loop
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //varpim tablosunu yazalim

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.print(i + "x" + j + " = " + i * j + " ");

            }
            System.out.println();

        }


        //asagidkai odev olucak
        //*
        //**
        //***
        //****
        //*****




    }
}
