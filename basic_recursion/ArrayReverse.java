package basic_recursion;

public class ArrayReverse {
    // public static void reverse(int[] arr, int n) {
        
    //     if(arr.length/2==n){
    //         return;
    //     }
    //     int left = arr.length-1-n;

    //     int temp = arr[left];
    //     arr[left] = arr[n];
    //     arr[n] = temp;

    //     reverse(arr,n-1);
    // }

    public static void reverse(int[] arr, int left,int right) {
        
        if(left>=right){
            return;
        }
        

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr,left+1,right-1);
    }

    public static void main(String args[]){
       int arr[] = {1,2,3,4,5};
       int n = arr.length;
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       }
       System.out.println();
    //    reverse(arr,n-1);
       reverse(arr,0,n-1);
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       }
    }
}
