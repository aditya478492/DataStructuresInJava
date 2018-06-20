package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};

        for(int key=1;key<arr.length;key++){
            int ele=arr[key];
            int j=key-1;
            while(j>0 && arr[j]>arr[key]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=ele;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
