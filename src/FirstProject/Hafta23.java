package FirstProject;

public class Hafta23 {


    public static void main(String[] args) {

        //write a method which finds the max element in an array

        int[] arr = {3,5,8,9,7,6,2,3};


        findMax(arr);

        int result = findMax1(arr);
        System.out.println("result = " + result);

        //scope of variables: degiskenin yasam alani

    }

    private static int findMax1(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(max < arr[i]){

                max = arr[i];
            }
        }
        return max;
    }

    private static void findMax(int[] arr) {


    }


}
