package FirstProject;

public class Hafta23_variablesScope {

    //scope of variable: tanimlanma alani

    private static int x = 5;  //global variable


    public static void main(String[] args) {  //           { =curly     [  =square     (    =round       <   =angle brackets
                                             //      USA: { = braces  [ = brackets   (  =parenthesis

       // int x = 5; //local variable

        Add2ToVariable(x);

        Hafta23_variablesScope.Add2ToVariable(4);

        System.out.println("x = " + x);


        //byte = 1 byte = 8 bits =

        //byte a = -129;  -128 <= byte <= 127
        //int 4 byte =


    }

    public static void Add2ToVariable(int x) {

        x = x + 2;

    }

    public static void Add3ToVariable(int y) {



        System.out.println(x);
    }



}
