package basic_math;
import java.util.*;

public class GCD_of_two_no {
    static public int GCD(int n1, int n2) {
        // HDC
        // for(int i=Math.min(n1,n2);i>=0;i--){
        //     if(n1%i==0 && n2%2==0){
        //         return i;
        //     }
        // }
        // return 0;

        int gcd=0;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        System.out.println(GCD(9,8));
    }
}
