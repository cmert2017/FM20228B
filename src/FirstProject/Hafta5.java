package FirstProject;

public class Hafta5 {

    public static void main(String[] args) {

        //intellisense im caismiyordu bende intelli J idea mi yeniden baslattim ve problem cozuldu.

        //best coding practices
        //1- parentez blocklari yeni line dan baslar
        

        System.out.println("5+2");
        System.out.println(5+2);
        System.out.println(5);

        // 5 + 2 =  7
        System.out.println("5+2 = " + 5 + 2);
        System.out.println("5+2 = " + (5 + 2));
        System.out.println("******carpim tablosu 3lere ait*********");
        System.out.println("3 * 1 = " + (3 * 1));
        System.out.println("3 * 2 = " + (3 * 2));
        System.out.println("3 * 3 = " + (3 * 3));
        System.out.println("3 * 4 = " + (3 * 4));
        System.out.println("3 * 5 = " + (3 * 5));
        System.out.println("3 * 6 = " + (3 * 6)); //burdaki parentezler gereksiz yani redundant 
        System.out.println("3 * 7 = " + 3 * 7);
        System.out.println("3 * 8 = " + 3 * 8);
        System.out.println("3 * 9 = " + 3 * 9);
        System.out.println("3 * 10 = " + 3 * 10);

       // "5 + 2 = 5" + 2
        //"5 + 2 = 52"




        //windows: snagit ile ekran goruntusu alabilirsiniz ve uzerinde oynayabilirisniz
        //cmd + shift + 5 ile ekran goruntusu alacaginiz programi cagirip ekran goruntusu alabilirisniz



        //variables: bilinmeyen kullanma
        System.out.println("*********Variables**************");

        //declaration of a variable
        String companyName = "First Brick International";
        System.out.println(companyName);

        String teacherCount2 = "500";


        System.out.println("**********StudentToTacherRatio**********");



        int teacherCount1 = 500;
        int studentNumber = 10000;

        //int studentToTeacherRatio1 = 10000/500;

        int studentToTeacherRatio2              =                  studentNumber / teacherCount1 ;

        //declaration                    assigment operator                    initial value

       // System.out.println("Student to Teacher ratio is " + studentToTeacherRatio1);
        System.out.println("Student to Teacher ratio is " + studentToTeacherRatio2);



        System.out.println("**********StudentToTacherRatio**********");

      //With your caret on a line, you can press ⌥⇧↑ (macOS),
        // Alt+Shift+Up Arrow (Windows/Linux), to move a line up.


        System.out.println(companyName + " is an international organization");
        System.out.println("There are over " + teacherCount1 + " teachers in " + companyName);
        //"There are over" + 500
        //"There are over 500"
        // "There are over 500 teachers in "
        
        
        //PO: Product owner: artik sirketin Frit Brick degil First Brisk International. Bunu programmda degistirin.
        


        //Task: uzunluklari verilen dikdortgenin alaninini bulunuz.



        System.out.println("**************dikdortgen alan hesaplama*********");
/*        int uzunluk;
        uzunluk = 10;
        int genislik = 6;
        int alanDikdortgen1 = uzunluk * genislik;

        System.out.println("Birinci dikdortgenin uzunlugu = " + uzunluk);
        System.out.println("Birinci dikdortgenin genisligi = " + genislik);
        System.out.println("Birinci dikdortgenin alani = " + alanDikdortgen1);


        int uzunluk2 = 30 ;
        int genislik2 = 10;
        int alanDikdortgen2 = uzunluk2 * genislik2 ;

        System.out.println("ikinci dikdortgenin uzunlugu = " + uzunluk2);
        System.out.println("ikinci dikdortgenin genisligi = " + genislik2);
        System.out.println("Ikinci dikdortgenin alani = " + alanDikdortgen2);
        */

        System.out.println("**************dikdortgen alan hesaplama v2*********");

        int uzunluk = 10;
        int genislik = 6;
        int alanDikdortgen = uzunluk * genislik;

        System.out.println("Birinci dikdortgenin uzunlugu = " + uzunluk);
        System.out.println("Birinci dikdortgenin genisligi = " + genislik);
        System.out.println("Birinci dikdortgenin alani = " + alanDikdortgen);


        uzunluk = 30 ;
        genislik = 10;
        alanDikdortgen = uzunluk * genislik;


        System.out.println("ikinci dikdortgenin uzunlugu = " + uzunluk);
        System.out.println("ikinci dikdortgenin genisligi = " + genislik);
        System.out.println("Ikinci dikdortgenin alani = " + alanDikdortgen);











        //Hafta5 Odev
        String firstName = "John";
        String lastName = "Thomouse";
        String profession = "Graphic Designer";





        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("profession = " + profession);


    }


   


}
