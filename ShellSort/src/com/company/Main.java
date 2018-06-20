package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int it = gap; it < arr.length; it++) {
                int nxt=it-gap;
                    int temp1=arr[it];
                    while(nxt>=0 && temp1<arr[nxt]){
                        arr[nxt+gap]=arr[nxt];
                            if(nxt-gap<0){
                                nxt=nxt;
                                break;
                            }else{
                                nxt = nxt - gap;
                            }
                    }
                    if(temp1<arr[nxt]){
                    arr[nxt]=temp1;
                    }else {
                        arr[nxt + gap] = temp1;
                    }
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}

