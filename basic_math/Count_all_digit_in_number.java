package basic_math;

public class Count_all_digit_in_number {
    public static int countDigit(int n) {
        int count = 0;
        while(n>0){
            count++;
            n =n/10;
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println("123 : Digit Count  : "+countDigit(123));
    }
}
