public class Pattern14 {
    public static void main(String[] args) {
        int n = 5,no=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)no+" ");
                no++;
            }
            System.out.println("");
        }
    }
}
