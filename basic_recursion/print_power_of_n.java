
public class print_power_of_n {
    public static int powerOfN(int n, int i) {
        if (i == 0) return 1;
        return n * powerOfN(n, i - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfN(2,10)); 
      
    }
}
