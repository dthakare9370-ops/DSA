public class SubArray_sum {
    public static void main(String[] args) {
        int arr[] = {4,7,10,7,3,5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // int start = -1;
        // int end = -1;
        // int start1 = -1;
        // int end1 = -1;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int sum = 0;
        //         for(int k=i;k<=j;k++){
        //             sum = sum + arr[k];
        //         }
        //         System.out.println(sum);
        //         if(max<sum){
        //             max = sum;
        //             start = i;
        //             end = j;
        //         }

        //         if(min>sum){
        //             min=sum;
        //             start1 = i;
        //             end1 = j;
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("min : "+min);
        // System.out.println("max : "+max);

        // //Print subaary which has the max sum 
        // for(int i=start;i<=end;i++){
        //     System.out.print(arr[i]+"\t");
        // }
        // System.out.println();

        // //Print subaary which has the min sum 
        // for(int i=start1;i<=end1;i++){
        //     System.out.print(arr[i]+"\t");
        // }


        int sum=0;
        for(int i=0;i<arr.length;i++){
            //Kadance Alogo
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





