package basic_recursion;

public class PrintName_N_time {
    public static void printName(int n){
        if(n<=0){
            return;
        }
        System.out.println("Ganesh");
        printName(--n);
    }
    public static void main(String args[]){
        printName(1);
    }
}
