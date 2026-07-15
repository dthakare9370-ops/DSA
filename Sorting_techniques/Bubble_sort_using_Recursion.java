class Bubble_sort_using_Recursion{
    public static void bubbleSort(int arr[],int size){
         
        if(size==1)
            return;

        boolean swapped = false;
        for(int i=0;i<size-1;i++){
            if(arr[i]>=arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }

        //if array is sorted then time complexity is O(n)
        if(!swapped)
            return;

        bubbleSort(arr,size-1);
    }

    public static void main(String[] args) {
        int arr[] = {7 ,4 ,1 ,5 ,3};
        // int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println("Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        bubbleSort(arr,arr.length);
        System.out.println();
        System.out.println("After Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

    
        


    /* Time Complexity
    
    Bubble Sort with swapped flag:

        Best Case → O(n)
        Average Case → O(n²)
        Worst Case → O(n²)
    
    */