package basic_recursion;

public class Sum_n_Natureal_number {
    public static int Natural_Number_sum(int n){
        if(n==1){
            return 1;
        }
        return n+Natural_Number_sum(n-1);
    }
    public static void main(String args[]){
        System.out.println(Natural_Number_sum(5));
    }
}
