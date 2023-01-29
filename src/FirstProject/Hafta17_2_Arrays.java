package FirstProject;

public class Hafta17_2_Arrays {

    public static void main(String[] args) {

        int[] myArray = new int[5];

        //myArray[4] = 3;


        System.out.println(myArray[4]);
        System.out.println(myArray[3]);


        String[] names = new String[10];
        System.out.println(names[4]);

        //default values are assigned by java to non-primitive data types.
 /*
        int x ;
        System.out.println("x = " + x);

  */


        //1. soru: avegrage score bulma

        int[] mathScores = new int[10];
        mathScores[0] = 100;
        mathScores[1] = 90;
        mathScores[2] = 100;
        mathScores[3] = 50;
        mathScores[4] = 100;
        mathScores[5] = 100;
        mathScores[6] = 10;
        mathScores[7] = 40;
        mathScores[8] = 80;
        mathScores[9] = 100;

        //command(control) + option + L bu codu muzu guzellestiriyor. formatliyor.

        //yukardaki tekrardan kurtulmak icin array ile alakali soyle bir yontem gelistirmisler

        int[] matScores2 = {80,90,100,50,130,100,10,40,80,100};


        //matematiksel cozum:
        //1.adim + sayilari toplariz: toplam = (100 + 90 +100 + 50 +  100 + 100 + 10 + 40 +80 + 100 ) = 770
        //2.adim = toplami score larin sayisina bolucez. Ortalama = 770 / 10 = 77

        int toplam = 0;

        for (int i = 0; i < 10; i++) {

          //  toplam = toplam + matScores2[i];
            toplam += matScores2[i];
        }


        //int ortalama = toplam / 10;
        int ortalama = toplam / matScores2.length;

        System.out.println("ortalama = " + ortalama);


        //2.a. max score bulma

        //matematiksel:
        // ilk sayiya max diyecez.
        //daha sonra onu tek tek tum sayilarla karsilastiracaz.
        int max = matScores2[0];

        for (int i = 1; i < matScores2.length; i++) {

            if(max < matScores2[i]){
                max = matScores2[i];
            }

        }

        System.out.println("max = " + max);



        //2.b min score u bulma




    }
}
