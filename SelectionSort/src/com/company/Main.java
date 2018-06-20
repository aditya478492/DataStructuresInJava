package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};

        for(int pass=arr.length-1;pass>0;pass--){
            int largest=0;
            for(int i=1;i<pass;i++){
                if(arr[i]>arr[largest]){
                    largest=i;
                }
            }
            if(arr[largest]>arr[pass]){
                int temp=arr[largest];
                arr[largest]=arr[pass];
                arr[pass]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
