package FirstProject;

import java.util.Scanner;

public class Hafta14_1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*

        System.out.println("Enter your email");
        String email = input.next();

        int indexOfAyarac = email.indexOf("@");

        String username = email.substring(0,indexOfAyarac);

        System.out.println("username = " + username);


 */


        // contains: included or not

        String str3 = "Java, C#, Python, Ruby, C++";


        System.out.println(  str3.contains("Java") ); //true
        System.out.println(str3.contains("java")); //false




        String str4 = "avas, C#, PythonJ, Ruby, C++";
        System.out.println(str4.contains("Java")); //false





        // isEmpty: checks if the length of string is 0
        String str = "Hello";

        System.out.println(str.isEmpty()); //false



        String str1 = " ";//this is not an empty string

        System.out.println(str1.isEmpty()); //
        System.out.println(str1.length()); //


        String str2 = "";//this is en Empty string

        System.out.println(str2.isEmpty()); //
        System.out.println(str2.length()); //



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
