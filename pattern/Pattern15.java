public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            int no=65;
            for(int j=1;j<=n-i+1;j++){
                System.out.print((char)no+" ");
                no++;
            }
            System.out.println("");
        }
    }
}
