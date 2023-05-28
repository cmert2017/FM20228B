package FirstProject.Hafta25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class shop {

    public static void intro(){

        System.out.println("merhaba online dukkanimiza hosgeldiniz \n" +
                "ne almak istersiniz?\n\n" +
                "1-okul esyalari\n" +
                "2-oyun\n" +
                "3-kart\n" +
                "4-film/kitap\n" +
                "5-elektronik");

    }

    public static void main(String[] args) throws FileNotFoundException {

        intro();





        File cantaSaysiFile = new File("src/FirstProject/Hafta25/cantasayisi.txt");
        Scanner inputFromFile = new Scanner(cantaSaysiFile);
        Canta.cantaSayisi = inputFromFile.nextInt();





        Scanner scanner = new Scanner(System.in);
        int cevap = scanner.nextInt();

        if (cevap == 1){
            System.out.println("asagidaki esyalardan hangisini istersiniz?: \n" +
                    "a-canta \n" +
                    "b-kalem \n" +
                    "c-silgi\n" +
                    "d-defter");
            String cevap1 = scanner.next();
            if (cevap1.equals("a")){  //syntax error, run time error, logical error
                //int cantasayisi = 5;
                System.out.println("Dukkanimizda " + Canta.cantaSayisi + " tane canta var");
               //int cantaucreti = 10;



               //int dukkangeliri = 0;
                System.out.println("bir canta " + Canta.cantaUcreti + " dolar");
                System.out.println("tebrikler canta alisiniz gerceklesti");
                //cantasayisi = 4;
                Canta.cantaSayisi--;
                //dukkangeliri += cantaucreti;






















            }else if(cevap1.equals("b")){
                int kalemsayisi = 3;
                int kalemucreti = 1;
                int dukkangeliri = 0;
                System.out.println("bir canta " + kalemucreti + " dolar");
                kalemsayisi = 4;
                dukkangeliri += kalemucreti;
            }else if(cevap1.equals("c")){
                int silgisayisi = 5;
                int silgiucreti = 10;
                int dukkangeliri = 0;
                System.out.println("bir canta " + silgiucreti + " dolar");
                System.out.println("tebrikler canta alisiniz gerceklesti");
                silgisayisi = 4;
                dukkangeliri += silgiucreti;
            }else if (cevap1.equals("d")){
                int defterSayisi = 5;
                int defterUcreti = 10;
                int dukkangeliri = 0;
                System.out.println("bir canta " + defterUcreti + " dolar");
                System.out.println("tebrikler canta alisiniz gerceklesti");
                defterSayisi = 4;
                dukkangeliri += defterUcreti;
            }

        } else if (cevap == 2) {



        } else if (cevap == 3) {



        } else if (cevap == 4) {



        }

        //odev: yukardaki else if let tamamlanacak

        Defter benimDefterim = new Defter("sari",20,10,"plastik", "normal", 48);

        System.out.println("benimDefterim.toString() = " + benimDefterim.toString());


    }
}