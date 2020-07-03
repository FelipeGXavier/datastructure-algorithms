package com.algorithms.array.search;

public class BinarySearch {

    public static boolean search(int[] arr, int value){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = (start + end)/2;
            if(arr[middle] == value){
                return true;
            }else if(value > arr[middle]){
                start = middle + 1;
            }else if(value < arr[middle]){
                end = middle - 1;
            }
        }
        return false;
    }
}
