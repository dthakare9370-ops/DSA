class Pattern8{
    public static void main(String args[]){
        int n=5;
        int star = 2*n-1;
        for(int i=1;i<=n;i++){
            int space = i-1;
            int count = 1;

            while(count<=space+star){
                if(count<=space){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                count=count+1;
            }
            System.out.println();
            star = star-2;
        }
    }
}