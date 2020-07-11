package com.algorithms.misc;

public class MathUtils {

    /**
     * Algoritmo de Euclides para calcular o MDC
     * O Divisor passa a ser o dividendo e o dividendo para a ser o resto da última operação var1 % var2
     * Isso ocorre até o resto ser igual a zero
     * **/
    public static int mdc(int var1, int var2){
        int remainder = 0;
        while(var2 != 0){
            remainder = var1 % var2;
            var1 = var2;
            var2 = remainder;
        }
        return var1;
    }

    public static int mmc(int var1, int var2){
        return (var1 * var2)/mdc(var1,var2);
    }

    public static int greatestDiff(int[] arr1){
        int greaterDiff = arr1[1] - arr1[0];
        for (int i = 0; i < arr1.length; i++){
            for (int j = i + 1; j < arr1.length; j++){
                if((arr1[j] - arr1[i]) > greaterDiff){
                    greaterDiff = arr1[j] - arr1[i];
                }
            }
        }
        return greaterDiff;
    }
}
