package FirstProject;

import java.util.Scanner;

public class Hafta14 {


    public static void main(String[] args) {
     //Recap and future topics

    //variable
    //if-blocks
    //string
    //loops


    //class and object
    //other data-structures: array: list of objects: numbers, strings, etc.

    ///bu haftanin konulari:
    //girilen kelimeyi tersden yazdiriniz:

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");

        String girilenKelime = input.next();

        //H e l l e
        //0 1 2 3 4
        System.out.println("girilenKelime.indexOf('e') = " + girilenKelime.indexOf('e'));

        System.out.println("girilenKelime.charAt(0) = " + girilenKelime.charAt(0));


/*
        //kismi cozum uzunlugu bilinen kelimenin tersden yazdirilmasi
        char birinciCharacter = girilenKelime.charAt(0);
        char ikinciCharacter = girilenKelime.charAt(1);
        char ucuncuCharacter = girilenKelime.charAt(2);
        char dorduncuCharacter = girilenKelime.charAt(3);
        char besinceCharacter = girilenKelime.charAt(4);

        System.out.print(besinceCharacter);
        System.out.print(dorduncuCharacter);
        System.out.print(ucuncuCharacter);
        System.out.print(ikinciCharacter);
        System.out.println(birinciCharacter);
        */


/*

        //uzunlugu bilinmeye kelimenin tersden yazdirilmasi
        int uzunlugu = girilenKelime.length();

        char sonCharacter = girilenKelime.charAt(uzunlugu-1);
        System.out.println("sonCharacter = " + sonCharacter);

        //Ali --> uzunluk= 3, son karakter index: 2

 */
/*

       //ucuncu deneme:
        //kismi cozum uzunlugu bilinen kelimenin tersden yazdirilmasi
        int uzunlugu = girilenKelime.length();
        int index = 0;

        if(index < uzunlugu) {
            char birinciCharacter = girilenKelime.charAt(index);
        }else{
            System.exit(0);
        }

        index++;

        if(index < uzunlugu){
            char ikinciCharacter = girilenKelime.charAt(index);
        }else{
            System.exit(0);
        }


        index++;


        if(index < uzunlugu){
            char uucncuCharacter = girilenKelime.charAt(index);
        }else{
            System.exit(0);
        }

        index++;

        if(index < uzunlugu){
            char dorduncuCharacter = girilenKelime.charAt(index);
        }else{
            System.exit(0);
        }


        index++;

        if(index < uzunlugu){
            char besinciCharacter = girilenKelime.charAt(index);
        }else{
            System.exit(0);
        }

        index++;


        if(index < uzunlugu){
            char altinciCharacter = girilenKelime.charAt(index);
        }else{
            System.exit(0);
        }

        index++;


        //...

 */

/*

        System.out.print(besinceCharacter);
        System.out.print(dorduncuCharacter);
        System.out.print(ucuncuCharacter);
        System.out.print(ikinciCharacter);
        System.out.println(birinciCharacter);

 */

        String greeting = "Hello";

        greeting = greeting.concat(" John");   //"Hello John"


        System.out.println("girilenKelime.toUpperCase() = " + girilenKelime.toUpperCase());
        System.out.println("girilenKelime.toLowerCase() = " + girilenKelime.toLowerCase());

        String sentence = "Java is fun";

        String substring1 = sentence.substring(2);

        System.out.println("substring1 = " + substring1);

        String word1 = sentence.substring(0, 4);
        System.out.println("word1 = " + word1);




        //Exercise: girilen emailin ilk kismini bastirin. yani username kismini bastirin
        //A valid e-mail address is an address composed of two parts,
        // a username and a domain name, in the following form: username@domainname.extension


        System.out.println("Enter your email");
        String email = input.next();



        int indexOfAyarac = email.indexOf("@");

        String username = email.substring(0,indexOfAyarac);

        System.out.println("username = " + username);


        // contains: included or not

        String str3 = "Java, C#, Python, Ruby, C++";

        System.out.println(  str3.contains("Java") ); //true
        System.out.println(str3.contains("java")); //false





















        // isEmpty: checks if the length of string is 0
        String str = "Hello";

        System.out.println(str.isEmpty()); //false



        // equalsIgnoreCase: ignore case sensitivity
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5));  //false
        System.out.println(s4.equalsIgnoreCase(s5));  //true




        // replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#"); //"....."

        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");

        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is" , "C# is"    );

        System.out.println(s3);









    }
}
