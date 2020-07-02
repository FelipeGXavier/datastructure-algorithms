package com.algorithms.array.rotation;

public class ArrayUtils {

    public static void rotateLeftWithTemporaryArray(int[] arr, int d){
        int size = arr.length;
        int[] tempArray = new int[d];
        for (int i = 0; i < d; i++){
            tempArray[i] = arr[i];
        }
        for (int x = d; x < size; x++){
            arr[x - d] = arr[x];
        }
        int k = 0;
        for (int j = size - d; j < size; j++){
            arr[j] = tempArray[k];
            k++;
        }
    }

    public static void rotateLeftOneByOne(int[] arr, int d){
        int k = 0;
        while (k < d){
           int tmp = arr[0];
           int size = arr.length;
           for (int i = 0; i < size - 1; i++){
               arr[i] = arr[i + 1];
           }
           arr[size - 1] = tmp;
           k++;
        }
    }

    public static void rotateRightOneByOne(int[] arr, int d){
        int k = 0;
        while (k < d){
            int size = arr.length;
            int tmp = arr[size - 1];
            for (int i = size - 1; i  > 0 ; i--){
                arr[i] = arr[i - 1];
            }
            arr[0] = tmp;
            k++;
        }
    }
}
