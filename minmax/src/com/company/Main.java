package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={-20,89,76,-90,7};
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
