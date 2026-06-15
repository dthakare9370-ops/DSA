public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for(int row=1;row<=n*2-1;row++){
            int level;

            if(row<=n){
                level = row;
            }else{
                level = 2*n-row;
            }

            int star = 2*level-1;
            int count = 1;
            while(count<=star){
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }
}   
