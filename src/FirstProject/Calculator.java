package FirstProject;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*********Calculator**********");
        System.out.println("***Yapmak istediginiz islemi giriniz****");
        System.out.println("1- Toplama");
        System.out.println("2- Cikarma");
        System.out.println("3- Bolme");
        System.out.println("4- Carpma");
        System.out.println("5- Kalani Bul");

        System.out.println("Tercih: ");
        int tercih = input.nextInt();
        

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter Second number: ");
        int num2 = input.nextInt();



        //processs
       // int sum = 0, difference = 0, division=0 , product=0,  remainder=0 ;
        int result = 0;

        //eger 1 secili ise 
       if (tercih == 1) {

           result = num1 + num2 ;
        //   System.out.println("sum is "+ sum);
       } 
       
        //eger 2 secili ise
        if(tercih==2){
            result = num1 - num2;
          //  System.out.println("difference is "+ difference);
        }
        

        // eger bolme secili ise
        if(tercih==3){
            result = num1 / num2 ;
          //  System.out.println("division is "+ division);
        }

        //carpma
        if(tercih==4){
            result = num1 * num2 ;
          //  System.out.println("product is "+ product);
        }

        //remainder
        if(tercih==5){
            result = num1 % num2 ;
           // System.out.println("remainder is "+ remainder);
        }


        //---output
        System.out.println("result is: " + result);


        //optimization: line of code, data structures, time and space complexity
        //tech dept: minimum calisan urun ortaya cikti. Ama bunu optimization etmemiz lazim.

        
        
        
        

    






    }
}
