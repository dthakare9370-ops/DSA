public class Missing_number_1_to_n {
    // Missing Number From (1-n)
    public static int missingNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0 ;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int total = (max*(max+1))/2;
        return total - sum;
    }
    public static void main(String[] args) {
        // int arr[] = {1, 2, 4, 5, 6};
        int arr[] = {1, 2, 3, 5};
        System.out.println("Missing Number is : "+missingNumber(arr));
    }
}
