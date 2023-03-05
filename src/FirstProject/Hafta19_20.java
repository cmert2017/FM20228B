package FirstProject;

import java.util.Arrays;
import java.util.Scanner;

public class Hafta19_20 {


    public static void sayHello(){

        System.out.println("Hello");
    }



    //odev2: verilen isimdeki en fazla tekrar eden harfi bulma
    public static void main(String[] args) {

        //odev1: verilen sayi listesindeki en fazla tekrar eden sayiyi bulma



        sayHello();

        int x = 5;
        int y = 6 + x ;

        System.out.println(y);

        String name = "Temel";


        // N = { 0,1,2,3,...} generally three dots, eclipsse
        // E = {2,4,6,8,...}
        //X = { 7,14,21,...}



        //ascii vs unicode

        System.out.println("☺");
        System.out.println("\u263A");
        System.out.println("\u1F1F");




        //array visulization icin suraya bak: Resources/ArraysVisulization1.png


        //pratik yapmak icin: https://www.codewars.com/kata/search/my-languages?q=array&beta=false&order_by=sort_date%20desc


        //kullanicidan array in size ini tanimlamasini ve degerleri girmesini istemek

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = input.nextInt(); // the number of temperatures to analyse
        int[] myTemperatureArray=new int[n];

        for (int i = 0; i < n; i++) {
            myTemperatureArray[i] = input.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
        }

        System.out.println("Original myTemperatureArray = " + Arrays.toString(myTemperatureArray));

        Arrays.sort( myTemperatureArray);

        System.out.println("Sorted myTemperatureArray = " + Arrays.toString(myTemperatureArray));

        System.out.println("Arrays.binarySearch(myTemperatureArray, 8) = "
                + Arrays.binarySearch(myTemperatureArray, 8));



        //odev: https://www.codingame.com/ide/puzzle/temperatures





    }



}
