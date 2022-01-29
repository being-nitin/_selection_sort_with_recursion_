package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// selection sort with recursion.
        int[] arr = {7,4,9,5,2};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }
            else{
                selection(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr,r-1,0,0);
        }
    }
}
/* selection sort means it will find the max element in an array and put it on the last index then the second last element
on second last index and so on.
r represent the last index +1 and c will be the remaining elements in which we will check the max element in
an array.
In the else condition it will just swap the last index will the max that is r-1.

 */