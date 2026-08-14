package basic_math;
import java.util.*;
public class PrimeNumber {
    static public boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is Not Prime");
        }
        sc.close();
    }
}
