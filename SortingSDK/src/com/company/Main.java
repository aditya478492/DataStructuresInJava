package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={20,35,-15,20,55,1,-22};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
