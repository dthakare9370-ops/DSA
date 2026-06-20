package Searching;

public class Binary_Search {

    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){  
            int mid = start+(end-start)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = {7 ,4 ,1 ,5 ,3};
        int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println("Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int index = binarySearch(arr,9);

        if(index>=0)
            System.out.println("\nElement Present at Index : "+index);
        else
            System.out.println("\nElement is not present");
    }
}
