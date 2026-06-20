class Second_Largest_Element{
    public static int secondLargestElement(int[] nums) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i]>large){
                secondLarge=large;
                large = nums[i];
            }else if(nums[i]>secondLarge && nums[i] != large){
                secondLarge = nums[i];
            }
        }

        return (secondLarge==Integer.MIN_VALUE?-1:secondLarge);
    }
    public static void main(String args[]){
        int arr[] = {10,7,8,5,3,12,20};
        System.out.println("Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int ele = secondLargestElement(arr);
        if(ele==-1){
            System.out.println("\nSecond Large Element is not found");
        }else{
            System.out.println("\nSecond largest Elements is : "+ele);
        }
    }
}