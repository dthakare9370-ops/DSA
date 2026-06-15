public class  Pattren18{
    public static void main(String[] args) {
        int row= 5;
        

        for(int i=1;i<=row;i++){
            int no = 64+row-i+1;
            for(int j=1;j<=i;j++){
                System.out.print((char)no);
                no++;
            }
            System.out.println();
        }
    }
}
