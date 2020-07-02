package com.algorithms.sorting;


public class MergeSort {



    public void mergeSort(int[] entry){
        int middle = entry.length/2;
        if(middle < 2){
            return;
        }
        int[] left = new int[middle];
        int[] right = new int[entry.length - middle];
        for (int i = 0; i < middle; i++){
            left[i] = entry[i];
            right[i] = entry[middle+i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(entry, left, right);
    }

    private void merge(int[] entry, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                entry[k] = left[i];
                i++;
            }else {
                entry[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            entry[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize){
            entry[k] = right[j];
            j++;
            k++;
        }
    }


}
