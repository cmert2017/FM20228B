package FirstProject;

import java.util.Arrays;

public class Hafta21_2 {


    public static void main(String[] args) {


        //multiD array

        int       [] mathNotlarim={9,8,7};
        int[] fizikNotlarim={7,7,10};
        int[] resimNotlarim={7,4,5};
        int[] sporNotlarim={10,10,9};


        System.out.println("Arrays.toString(mathNotlarim) = " + Arrays.toString(mathNotlarim));


        System.out.println("mathNotlarim[0] = " + mathNotlarim[0]);
        System.out.println("mathNotlarim[1] = " + mathNotlarim[1]);
        System.out.println("mathNotlarim[2] = " + mathNotlarim[2]);



        //if we have many elements then we use loops

        for (int i = 0; i < mathNotlarim.length; i++) {
            System.out.println("printing array elements via loop=" + mathNotlarim[i]);
        }



        //2D array

        int[]       [] tumNotlarim =  {mathNotlarim,fizikNotlarim,resimNotlarim,sporNotlarim,{3,5,7}};


        System.out.println("Arrays.deepToString(tumNotlarim) = " + Arrays.deepToString(tumNotlarim));


        System.out.println("Son matematik sinavi notum = " + tumNotlarim[0][2] );
        System.out.println("ikinci spordersi sinavi notum = " + tumNotlarim[3][1] );









    }
}
