public class SubArray_sum {
    public static void main(String[] args) {
        int arr[] = {4,7,10,7,3,5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int sum = 0;
        //         for(int k=i;k<=j;k++){
        //             sum = sum + arr[k];
        //         }
        //         System.out.println(sum);
        //         if(max<sum){
        //             max = sum;
        //         }

        //         if(min>sum){
        //             min=sum;
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("min : "+min);
        // System.out.println("max : "+max);


        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum<0){
                sum = 0;
            }
            sum = sum + arr[i];
            if(max<sum){
                max=sum;
            }
            if(min>sum){
                min=sum;
            }
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }
}





