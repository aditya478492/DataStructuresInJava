package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] arr={-1,-2,3,5,-10};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
           if(max+arr[i]>max){
               max=max+arr[i];
           }else{
               max=arr[i+1];
           }
        }
        System.out.println(max);
    }
}
