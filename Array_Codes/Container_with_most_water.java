public class Container_with_most_water {
    public static int containerMaxWater(int arr[]){
        // int maxWater = 0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         int w = j-i;
        //         int h = Math.min(arr[i], arr[j]);
        //         int currentWater = h*w;
        //         maxWater = Math.max(maxWater,currentWater);
        //     }
        // }
        // return maxWater;




        // Optimal Approch using Two Sum 
        int maxWater = 0;
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int currWater = width * height;
            maxWater = Math.max(maxWater, currWater);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerMaxWater(arr));
    }
}
