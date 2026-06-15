public class Pattern11 {
    public static void main(String args[]){
        int n = 5,no;
        for(int i=1;i<=n;i++){
            no = (i%2==0)?0:1;
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no = (no==0)?1:0;
            }
            System.out.println();
        }
    }
}
