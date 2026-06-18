
class Selection_sort{
    //Selection Sort 
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min  = i;
            for(int j=i+1;j<n;j++){
                if(nums[min]>nums[j]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        return nums;
    }

    public static void main(String args[]){
       int arr[] = {7 ,4 ,1 ,5 ,3};

       System.out.println("Before Sorting : ");
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       }
       int arr1[] = selectionSort(arr);
       System.out.println();
       System.out.println("After Sorting : ");
       for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
       }
       

    }
}


/* Time Complexity

   Selection Sort:

       Best Case    → O(n²)
       Average Case → O(n²)
       Worst Case   → O(n²)

*/