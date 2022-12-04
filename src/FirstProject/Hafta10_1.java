package FirstProject;

import java.util.Scanner;

public class Hafta10_1 {


    public static void main(String[] args) {
        //nested if

        Scanner input = new Scanner(System.in);
        System.out.print("Kac yillik java tecrubeniz var: ");
        int tecrubeYili = input.nextInt();

        if(tecrubeYili > 7){

            System.out.print("Java8 biliyormusunuz: ");
            boolean jave8BiliyorMu =  input.nextBoolean();

            System.out.print("Maven biliyormusunuz: ");
            boolean MavenBiliyorMu = input.nextBoolean();


            if(jave8BiliyorMu == true && jave8BiliyorMu ==true){
                System.out.println("Tebrikler is basvurunuz degerlendirilecek");
            }else{
                System.out.println("Basvurunuz red edildi");
            }


        }else {

            System.out.println("Basvurunuz red edildi");

        }








    }

}
