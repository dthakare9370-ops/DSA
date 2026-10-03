public class Last_occurance_return_index{
    public static int lastOccurance(int arr[],int i,int target){
        if(i==-1){
            return i;
        }
        if(arr[i] == target){
            return i;
        }
        return lastOccurance(arr, i-1, target);
    }
     public static void main(String args[]){
       int arr[] = {1,3,2,5,3,6,3,5,6};
       System.out.println(lastOccurance(arr,arr.length-1,7));
    }
}