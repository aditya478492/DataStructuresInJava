package com.company;

public class Main {

    public static void main(String[] args) {
	   int[] arr={20,35,-15,7,55,1,-22};
	   for(int pass=arr.length-1;pass>0;pass--){
	   	for(int j=0;j<pass;j++){
	   		if(arr[j]>arr[j+1]){
	   			swap(arr,j,j+1);
			}
		}
	   }
	   for(int k=0;k<arr.length;k++){
	   	System.out.println(arr[k]);
	   }
    }
    public static void swap(int[] arr1,int i,int j){
    	if(i==j){
    		return;
		}else{
    		int temp=arr1[i];
    		arr1[i]=arr1[j];
    		arr1[j]=temp;
		}
	}
}
