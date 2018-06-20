package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={2,5,9,8,2,8,7,10,4,3};
        int[] new_arr=new int[11];
        for(int i=0;i<arr.length;i++){
            new_arr[arr[i]]++;
        }
        int count=-1;
        for(int j=0;j<new_arr.length;j++){
            count++;
            int num=new_arr[j];
            while (num!=0){
                System.out.print(count+" ");
                num--;
            }
        }
    }
}
