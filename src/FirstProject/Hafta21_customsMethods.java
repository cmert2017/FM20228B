package FirstProject;

public class Hafta21_customsMethods {


    public static void main(String[] args) {


        System.out.println("min1(10,6) = " + min1(10, 6));
        System.out.println("min2(5,8) = " + min2(5, 8));

        System.out.println("max(4,7) = " + max(4, 7));

        isEligibleforVoting("Fatih",12,true);

    }

    private static void isEligibleforVoting(String name, int age, boolean citizen) {

        if(age > 18 && citizen == true){

            System.out.println(name + " is eligible to vote");
        }
        else{
            System.out.println(name + " is not eligible to vote");

        }

    }

    private static int max(int i, int i1) {


        return i > i1 ? i : i1 ;
    }


    public static int min1(int a, int b){

        int min;

        if(a < b){
            min = a;
        }else{
            min = b;
        }
        return  min;

    }


    //ternary operator
    public static int min2(int a, int b){

        return  a < b ? a : b ;
    }


    //bir sayinin herhangi bir kuvvetine bulan bir metod yaziniz
    //kullaniciya adini, yasini sorup ehliyet alip alamiyacagini hesapliyan bir method yaziniz




}
