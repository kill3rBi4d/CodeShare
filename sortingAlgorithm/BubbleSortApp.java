package sortingAlgorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * SORT ALGORITHM » Bubble Sorts Source Code
 *
 * @author : Yasvan
 *
 */

public class BubbleSortApp {
    public static void main(String[] args) {
        int[] arr = new int[6];                                     //declare a new array of integers (it could be long as well).

        insertFigures(arr);                                         // insert random item to the array
        System.out.println(Arrays.toString(bubbleSort(arr)));       // print out the array to the console

    }

    private static void insertFigures(int[] arr) {
        Random rand = new Random();
        int figures = 0;
        for (int f = 0; f < arr.length; f++){
            figures = rand.nextInt(10)+1;           //Generate random numbers between 1 and 10
            arr[f] = figures;
        }
        System.out.println("Generated array » (unsorted) \n" + Arrays.toString(arr));
    }

    /**
     * BUBBLE SORT » Given an array of items, the bubble sort will sort them
     *  in ascending order.
     * (e.g) » Given an array of integers int[6] = { 0, 1, 4, 5, 3, 6 }
     * So we have 6 items in our unsorted list of array, and let's number them from 0 to 5
     * Now, the way that bubble sort works is that it repeatedly compares adjacent in the list
     * and then if the item on the left is larger, it swaps.
     */
    public static int[] bubbleSort(int[] arr){
        int i, j, temp = 0;                             //Our variables i = for the outer loop, j = for the inner loop, and temp = for the swap.
        for (i = 0; i < arr.length - 1; i++){
            for (j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){               //if the first item on the left > the one on the right
                    temp = arr[j];                      //set the current swap item to be the first item on the left. temp = arr[0] - from the example [0, 1, 4, 5, 3, 6].
                    arr[j] = arr[j + 1];                //set the first item on the left to be the second on the left. So, arr[0] -> arr[1].
                    arr[j + 1] = temp;                  //Now swap the second item to the left, arr[1] -> arr[0] index/
                }
            }
        }
        System.out.println("New array » (sorted)");
        return arr;                                     //return the array
    }
}
