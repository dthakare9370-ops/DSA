package Searching;

public class Binary_Search_Recursion {
    public static void main(String[] args) {
        // int arr[] = {7 ,4 ,1 ,5 ,3};
        int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println("Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // int index = binarySearch(arr,9);
        int index = 0; 
        if(index>=0)
            System.out.println("\nElement Present at Index : "+index);
        else
            System.out.println("\nElement is not present");
    }
}
