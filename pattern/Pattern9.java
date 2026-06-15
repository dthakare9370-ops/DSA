class Pattern9{
    public static void main(String args[]){
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     int space = n-i;
        //     int star = 2*i-1;
        //     int count = 1;

        //     while(count<=space+star){
        //         if(count<=space){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //         count=count+1;
        //     }
        //     System.out.println();
        // }

        // int star = 2*n-1;
        // for(int i=1;i<=n;i++){
        //     int space = i-1;
        //     int count = 1;

        //     while(count<=space+star){
        //         if(count<=space){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //         count=count+1;
        //     }
        //     System.out.println();
        //     star = star-2;
        // }



        int n = 5;
        for(int row=1;row<=n*2-1;row++){

            int level;
            if(row<=n){
                level = row;
            }else{
                level = 2*n-row;
            }

            int space = n - level;
            int star = 2*level-1;
            int count = 1;

            while(count <= (space+star)){
                if(count<=space){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                count++;
            }
            System.out.println();
        }
    }
}