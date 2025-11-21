import java.util.Collections;

import java.util.Arrays;
public class InbuiltSort {
    public static void  insertionSort(Integer arr[]){
        
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(Integer arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        // insertionSort(arr);

        // for Descending order
        Arrays.sort(arr, Collections.reverseOrder());


        // Arrays.sort(arr, 0 ,3);
        printArr(arr);
    }
}

