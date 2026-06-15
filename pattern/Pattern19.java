public class Pattern19 {
    public static void main(String[] args) {
        int row = 5;
        int space=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print("*");  
            }
            for(int k=1;k<space;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=row-i+1;k++){
                    System.out.print("*");
            }
            space=space+2;
            System.out.println("");
        }

        space = row*2-1;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=row-i+1;j++){
                System.out.print("*");  
            }
            for(int k=1;k<space;k++){
               
                System.out.print(" ");
            }
            for(int k=1;k<=row-i+1;k++){
                    System.out.print("*");
            }
           space -=2;
            System.out.println("");
        }
    }
}
