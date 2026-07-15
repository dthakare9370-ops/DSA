class QuickSort{
    public static int partition(int arr[],int start,int end){
        int index = start-1, pivot = arr[end];
        
        for(int j=start;j<end;j++){
            if(arr[j]<= pivot){
                index++;
                int temp = arr[j];
                arr[j] = arr[index];
                arr[index]= temp;
            }
        }

        index++;
        int temp = arr[end];
        arr[end] = arr[index];
        arr[index]= temp;

        return index;
    }

    public static void quickSort(int arr[],int start,int end){
        if(start<end){
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }
    public static void main(String args[]){
        int arr[] = {7 ,4 ,1 ,5 ,3};
        // int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println("Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}