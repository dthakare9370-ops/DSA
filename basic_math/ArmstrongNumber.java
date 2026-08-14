package basic_math;
public class ArmstrongNumber {
    static public boolean isArmstrong(int n) {
        int no=n;
        int count=0;

        while(no>0){
            count++;
            no = no/10;
        }
        no=n;
        int sum = 0;
        while(no>0){
            int rem = no%10;
            int temp=1;
            for(int i=1;i<=count;i++){
                temp = temp*rem;
            }
            sum = sum + temp;
            // sum = sum + (int)Math.po
            // w(rem,count);
            no= no/10;
        }

        if(sum == n){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[]){
        System.out.println(isArmstrong(12));
    }
}
