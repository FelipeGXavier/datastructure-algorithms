package com.algorithms.array.rotation;

public class Main {

    public static void main(String[] args) {
        int[] stub = new int[] {1,2,3,4,5};
        ArrayUtils.rotateLeftWithTemporaryArray(stub, 1);
        System.out.println(stub);
        stub = new int[] {1,2,3,4,5};
        ArrayUtils.rotateRightOneByOne(stub, 1);
        System.out.println(stub);
    }
}
