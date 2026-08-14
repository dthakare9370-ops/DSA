public class Reverse_array_using_loop {
    public static void reverseArray(int arr[]){
        int j = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        
        System.out.println("\nBefore : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
reverseArray(arr);

        System.out.println("\nAfter : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
    }
}
