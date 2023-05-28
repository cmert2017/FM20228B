package FirstProject.Hafta25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dosyadanOkumaDeneme {


    public static void main(String[] args) throws FileNotFoundException {


        //dosyadan deger okuma

        /*
        Scanner inputFromTemrinal = new Scanner(System.in);
        String name = inputFromTemrinal.next();
        System.out.println(name);
         */




        File cantaSaysiFile = new File("src/FirstProject/Hafta25/cantasayisi.txt");


        Scanner inputFromFile = new Scanner(cantaSaysiFile);


        System.out.println("inputFromFile.next() = " + inputFromFile.next());





    }
}
