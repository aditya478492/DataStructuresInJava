package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={20,35,-15,7,55,1,-22};
        sort(arr,0,arr.length);

    }
    public static void sort(int[] arr,int start,int end){
        if(end-start<2){
            return;
        }
        int p=quick(arr,start,end);
        sort(arr,start,p);
        sort(arr,p+1,end);
    }

    public static int quick(int[] arr1,int start,int end){
        int p=arr1[start];
        int i=start;
        int j=end;
        int count=0;
        while(i<j){
            count++;
            if(count%2!=0){
                j--;
                while(arr1[j]>p){
                    j--;
                }
                arr1[i]=arr1[j];
            }else if(count%2==0 && i<j){
                i++;
                while(arr1[i]<p && i<j){
                    i++;
                    System.out.print("i value:"+i);
                    System.out.println();
                    System.out.print("j value:"+j);
                    System.out.println();
                }
                arr1[j]=arr1[i];
            }
        }
        arr1[i]=p;
        for(int u=0;u<arr1.length;u++){
            System.out.print(arr1[u]+" ");
        }
        System.out.println();
        return i;
    }
}
