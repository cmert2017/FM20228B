package FirstProject;

public class Hafta23_variablesScope {

    private static int x = 5;


    public static void main(String[] args) {

       // int x = 5;

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



}
