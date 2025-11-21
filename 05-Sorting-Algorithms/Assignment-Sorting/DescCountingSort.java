public class DescCountingSort {
    public static void  countingSort(int arr[]){
        
       int largest = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
        largest = Math.max(largest , arr[i]);
       }

       int count[] = new int[largest + 1];
       for(int i=0; i<arr.length; i++){
        count[arr[i]]++;
       }

       int j =0;
       for(int i = count.length-1; i>=0; i--){
        while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
        }
       }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        countingSort(arr);
        printArr(arr);
    }
}

