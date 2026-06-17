
package basic_hashing;

import java.util.*;

class Highest_Occurring{
    public static void main(String args[]){
        int arr[] = {1,2,6,3,1,4,2,5,5,5,5};

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int freq = 0;

            if(mp.containsKey(key))
                freq = mp.get(key);

            freq++;
            mp.put(key,freq);
        }

        int maxFreq = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(maxFreq<it.getValue()){
                maxFreq = it.getValue();
                ans = it.getKey();
            }
        }

        System.out.println(ans);

    }
}