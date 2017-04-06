package UdemyChallenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by manbir on 4/3/2017.
 */
public class ArrayChallenge {
   private static Scanner scanner = new Scanner(System.in);

   public static void main(String args[]) {
        int[] myintegers= getInteger(5);
        printArray(myintegers);
        int[] sortedArray = sortArray(myintegers);
        printArray(sortedArray);


   }

   public static int[] getInteger(int numbers) {

       int[] values = new int[numbers];

       System.out.println("Enter 5 numbers : ");
       for (int i=0;i<values.length; i++) {
           values[i]= scanner.nextInt();
       }
       return values;

   }
   public static void printArray(int[] array){
       for (int i =0; i<array.length;i++) {
           System.out.println("Element at index  " + i + "  is : " + array[i]);
       }

   }

   public static int[] sortArray(int[] array) {
//       int[] sortedArray= new int[array.length];
//       for (int i = 0 ; i<array.length;i++) {       //is the manual way of copying contents of one array into another
//           sortedArray[i] = array[i];
//       }

       int[] sortedArray = Arrays.copyOf(array,array.length); // using the ArraysandLists class with copyof method to copy contents of one array into another.

       int temp;
       boolean flag=true;
       while (flag) {
           flag = false;
           for (int i =0;i<sortedArray.length-1;i++) {
               if (sortedArray[i]<sortedArray[i+1]){
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray[i+1];
                   sortedArray[i+1] = temp;
                   flag = true;

               }

           }
       }
       return sortedArray;

   }
}
