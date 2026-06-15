package basic_math;

import java.util.ArrayList;

public class Divisor_of_number {
    static public int[] divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }

        int a[] = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]= arr.get(i);
        }
        return a;
    }

    public static void main(String args[]){
        int a[] = divisors(7);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
