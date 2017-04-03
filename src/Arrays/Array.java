package Arrays;

import java.util.Scanner;

/**
 * Created by manbir on 4/3/2017.
 */
public class Array {            //used to store multiple values of the same type.

//    public static void main(String args[]) {
        // int[] myIntArray = new int[10]; // this is how we initialize and assign size of the array;
        //myIntArray[5] = 50;  //value of position 6 (index 5) is assigned to 50;
        //  double[] myDoubleArray = new double[10];
//        myIntArray[0]=45;
//        myIntArray[1]=46;   //to assign values one by one to each element of the array.
//        myIntArray[2]=47;
        //  int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // used to tell that they array has 10 elements(0-9) and the values are assigned to it as well.

        //   System.out.println(myIntArray[5]);

//*************using a loop*****************

//        int[] myIntArray =new int[10];
//
//        for (int i=0;i<10;i++) {
//            myIntArray[i] = i * 10;
//        }
//
//        for (int i = 0; i<10; i++) {
//            System.out.println("Element " + i + " , value is : " + myIntArray[i]);
//        }
//
//
//    }
//
//
//}

//    *******************using the length() method**********************
//    it provides the same results as above.

//        int[] myIntArray = new int[25];
//
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " , value is : " + array[i]);
//        }
//    }

    // *********Using array in a good way ****************
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        int[] myIntegers = getIntegers(5);

        for (int i =0; i<myIntegers.length; i++) {
            System.out.println( "value of element  " + i + "  is : " + myIntegers[i]);
        }

        printAverage(myIntegers);
    }


    public static void printAverage(int[] array) {
        double sum = 0;
        double avg = 0;

        for (int i = 0 ; i<array.length; i++) {
            sum+= array[i];
        }

        avg = sum/array.length;
        System.out.println("Average is : " + avg);


    }

    public static int[] getIntegers(int nums) {
        System.out.println("Enter 5 values please");
        int[] values= new int[nums];
        for (int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;

    }
}



