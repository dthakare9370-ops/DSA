package Searching;

public class Linear_Search {

    public static int linearSearch(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {7 ,4 ,1 ,5 ,3};
        // int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println("Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int index = linearSearch(arr,5);

        if(index>=0)
            System.out.println("\nElement Present at Index : "+index);
        else
            System.out.println("\nElement is not present");
        
    }
}
