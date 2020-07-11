package com.algorithms.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Katas {

    public static boolean isIsogram(String str){
        Set<Character> letters = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++){
            letters.add(str.toLowerCase().charAt(i));
        }
        if(letters.size() != str.length()){
            return false;
        }
        return true;
    }

    public static int duplicateCount(String text){
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < text.length(); i++){
            if(letters.containsKey(text.toLowerCase().charAt(i))){
                letters.put(text.toLowerCase().charAt(i), letters.get(text.toLowerCase().charAt(i)) + 1);
            }else{
                letters.put(text.toLowerCase().charAt(i), 0);
            }
        }
        return (int) letters.entrySet().stream().filter(e -> e.getValue() > 0).count();
    }

    public static boolean duplicateNumber(int[] arr1){
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length - 1; i++){
            if(arr1[i] == arr1[i + 1]){
                return true;
            }
        }
        return false;

    }

    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null || a.length != b.length){
            return false;
        }
        int[] test = Arrays.stream(b).map(n -> (int) Math.sqrt(n)).toArray();
        boolean visited = false;
        for (int i = 0; i < test.length; i++){
            for (int j = 0; j < test.length; j++){
                if(a[i] == test[j]){
                    visited = true;
                }
            }
            if(!visited){
                return false;
            }
            visited = false;
        }
        return true;
    }
}
