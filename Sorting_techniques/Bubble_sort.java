    class Bubble_sort{
        
        //Bubble Sort
        public static int[] bubbleSort(int[] nums) {
            int n = nums.length;
            int count = 0;
            for(int i=0;i<n-1;i++){
                //optimazation 
                boolean swapp = false;
                for(int j=0;j<n-i-1;j++){
                    if(nums[j]>nums[j+1]){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;    
                        swapp = true;                  
                    }
                    count++;
                }
                if(!swapp){
                    break;
                }

            }
            System.out.println("\n\nCount : "+count);
            return nums;
        }
        
        public static void main(String[] args) {
            // int arr[] = {7 ,4 ,1 ,5 ,3};
            int arr[] = {1 ,2 ,3 ,4 ,5};
            System.out.println("Before Sorting : ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            int arr1[] = bubbleSort(arr);
            System.out.println();
            System.out.println("After Sorting : ");
            for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]+" ");
            }
        }
        
    }
        


    /* Time Complexity
    
    Bubble Sort with swapped flag:

        Best Case → O(n)
        Average Case → O(n²)
        Worst Case → O(n²)
    
    */