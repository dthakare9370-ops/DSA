
class Third_Largest_Element{
    public static int thirdLargestElement(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int data : nums){
            ts.add(data);
            if(ts.size()>3){
                ts.pollFirst();
            }
        }

        System.out.println("\nSize : "+ts.size());
        
        if(ts.size()>=3){
            return ts.first();
        }
        return ts.last();


        //Second Approch 
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int num : nums){

            if(num == first || num == second || num == third){
                continue;
            }

            if(num > first){
                third = second;
                second = first;
                first = num ;
            }else if(num > second){
                third = second;
                second = num ;
            }else if(num > third){
                third = num ;
            }
        }
        if (third == Long.MIN_VALUE) {
            return (int)first;
        }else{
            return (int)third;
        }
    }
    public static void main(String args[]){
        int arr[] = {3,2,2,1};
        System.out.println("Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int ele = thirdLargestElement(arr);

        System.out.println("\nThird largest Elements is : "+ele);
    }
}