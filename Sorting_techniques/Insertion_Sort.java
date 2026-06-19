class Insertion_Sort{

    //Insertion_Sort
    public static int[] insertionSort(int[] nums) {
        int n = nums.length;
        
        for(int i=1;i<n;i++){
            int key = nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        return nums;
    }


    public static void main(String[] args) {
        int arr[] = {7 ,4 ,1 ,5 ,3};
        // int arr[] = {1 ,2 ,3 ,4 ,5};
        System.out.println("Before Sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int arr1[] = insertionSort(arr);
        System.out.println();
        System.out.println("After Sorting : ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    } 
}