public class Product_of_array_without_itselft {
    public static int[] productExceptSelf(int[] nums) {
        // int p = 1;
        // for(int i=0;i<nums.length;i++){
        //     p=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             p = p * nums[j];
        //         }
        //     }
        //     System.out.println(p);
        // }






        //Optimal Solution 

        int n = nums.length;

        int prefix[] = new int[n];
        int sufix[] = new int[n];
        int ans[] = new int[n];

        prefix[0] = 1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            // System.out.println(prefix[i]);
        }

        sufix[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            sufix[i] = sufix[i+1] * nums[i+1];
            System.out.println(sufix[i]);
        }

        for(int i=0;i<n;i++){
            ans[i] = prefix[i] * sufix[i];
        }

        return ans;
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4};
        productExceptSelf(arr);
    }
}
