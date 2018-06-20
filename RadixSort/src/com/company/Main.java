package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={4725,4586,1330,8792,1594,5729};
        radix(arr,4);
        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]+" ");
        }
    }

    public static void count(int[] arr, int r){
        int[] arr1=new int[10];
        for(int i=0;i<arr1.length;i++){
            arr1[number(arr[i],4)]++;
        }
        int count=-1;
        int index=0;
        for(int j=0;j<arr1.length;j++){
            count++;
            int num=arr1[j];
            while(num>0){
                for(int k=0;k<arr.length;k++){
                    if(count==number(arr[k],r)){
                        arr[index]=arr[k];
                        index++;
                    }
                }
                num--;
            }
        }

    }

    public static int number(int num,int p){
        if(p==4){
            return num%10;
        }else if(p<4 && p>1){
            return (num%10^p-num%10^p-1)/10^p-1;
        }else{
            return (num-num%1000)/1000;
        }
    }

    public static void radix(int[] arr,int r){
        while(r>0){
            count(arr,4);
            //r--;
        }
    }
}
