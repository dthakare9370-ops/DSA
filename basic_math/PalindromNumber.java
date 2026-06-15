package basic_math;

public class PalindromNumber {
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
        if(reverseNo(122)==122){
            System.out.println("Number is Palindrom");
        }else{
            System.out.println("Number is Not Palindrom ");
        }
    }
}
