//Used only the hashmap 

package basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Frequencies_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,1,4,2,5};
        
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

        // for(Map.Entry<Integer,Integer> it : mp.entrySet()){
        //     System.out.println(it.getKey() + "->" + it.getValue());
        // }

        System.out.println("Enter Query : ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            int number = sc.nextInt();
            if(mp.containsKey(number))
                System.out.println(number +" -> "+ mp.get(number));
            else
                System.out.println(number +" -> 0");
        }

    }
    
}
