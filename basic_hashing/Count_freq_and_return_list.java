// Example 1
// Input: nums = [1, 2, 2, 1, 3]
// Output: [[1, 2], [2, 2], [3, 1]]
// Explanation:
// - 1 appears 2 times
// - 2 appears 2 times
// - 3 appears 1 time
// Order of output can vary.


package basic_hashing;

import java.util.*;

public class Count_freq_and_return_list {
    public static List<List<Integer>> countFrequencies(int[] arr) {
        // Collection HashMap Use
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int freq = 0;

            if(mp.containsKey(key)){
                freq = mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }

        List<List<Integer>> ans = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            List<Integer> temp = new ArrayList<>();

            temp.add(it.getKey());
            temp.add(it.getValue());
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,6,3,1,4,2,5};
        List<List<Integer>> ans = countFrequencies(arr);
        System.out.println(ans);
    }
}
