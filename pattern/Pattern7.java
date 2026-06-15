class Pattern7{
    public static void main(String args[]){
        // int n =5;
        // int star=1;
        // for(int i=1;i<=n;i++){
            
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=star;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     star += 2;
        // }

        int n=5;
        for(int i=1;i<=n;i++){
            int space = n-i;
            int star = 2*i-1;
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
        }
    }
}