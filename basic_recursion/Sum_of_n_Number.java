package basic_recursion;

public class Sum_of_n_Number {
    public static int numbersSum(int n) {

        if(n<=0){
            return 0;
        }
        return n+numbersSum(--n);
        
    }
    public static void main(String args[]){
        System.out.println(numbersSum(5));
    }
}
