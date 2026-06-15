package basic_math;

public class ReverseNumber {
    public static int reverseNo(int n){
        int rev=0,rem=0;

        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        System.out.println(reverseNo(123));
    }
}