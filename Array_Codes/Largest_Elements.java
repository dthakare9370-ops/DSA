class Largest_Elements{
    public static int largestElement(int[] nums) {
        int large = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large = nums[i];
            }
        }
        return large;
    }

    public static void main(String args[]){
        int arr[] = {4,7,10,7,3,5};
        System.out.println("Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int ele = largestElement(arr);
        System.out.println("\nLargest Elements is : "+ele);
    }
}