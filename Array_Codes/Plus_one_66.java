class Plus_one_66{
    public static int[] plusOne(int arr[]){
        int no = 0;
        for(int i=0;i<arr.length;i++){
            no = no*10+arr[i];
        }
        no = no+1;
        String str = String.valueOf(no);
        

        int arr2[] = new int[str.length()];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = str.charAt(i) - '0';
        }
        return arr2;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3};
        int arr2[] = plusOne(arr);
        for(int i=0;i<arr2.length;i++){
           System.out.print("\t"+arr2[i]);
        }
    }
}