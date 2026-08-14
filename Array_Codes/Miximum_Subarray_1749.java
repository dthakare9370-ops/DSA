public class Miximum_Subarray_1749 {
    public static int maxAbsoluteSum(int arr[]){
        int maxSum = 0;
        int minSum = 0;

        int minCurrent = 0;
        int maxCurrent = 0;

        for(int num : arr){
            
            maxCurrent += num;
            minCurrent += num;

            maxSum = Math.max(maxSum, maxCurrent);
            minSum = Math.min(minSum,minCurrent);

            if(minCurrent > 0){
                minCurrent = 0;
            }

            if(maxCurrent  < 0){
                maxCurrent = 0;
            }
        }
        return Math.max(maxSum,Math.abs(minSum));
    }
    public static void main(String args[]){
        int arr[] = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(arr));
    }
}
