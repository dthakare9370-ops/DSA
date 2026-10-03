package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {
    
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     int count = 0;
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 System.out.print(count);
    //                 return true;
    //             }
    //             count++;
    //         }
    //         count++;
    //     }
    //     System.out.print(count);
    //     return false;
    // }


    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int left = 0;
        int right = list.size()-1;

        int count=0 ;
        while(left != right){
            if(list.get(left)+list.get(right) == target){
                System.out.print(count);
                return true;
            }
            if(list.get(right)+list.get(left) < target){
                left++;
            }else{
                right++;
            }
            count++;
        }
        System.out.print(count);
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(pairSum1(list,90));

    }

}
