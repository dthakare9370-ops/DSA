import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Check_Array_Sorted{
    public static boolean isSorted(ArrayList<Integer> nums) {
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,89));
        System.out.println("Array : ");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        
        if(isSorted(arr)){
            System.out.println("\nArray Is Sorted ");
        }else{
            System.out.println("\n\nArray Is Not Sorted ");
        }
    }
}
