
public class Spiral_datafill {
    public static int[][] generateMatrix(int n) {
        
        int arr[][] = new int[n][n];
        int startCol = 0;
        int startRow = 0;
        int endRow = n-1;
        int endCol = n-1;
        int number = 0;

        while(startCol<=endCol && startRow<=endRow){
            //top
            for(int j=startCol;j<=endCol;j++){
                arr[startRow][j] = ++number;
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                arr[i][endCol] = ++number;
            }

            //bottom 
            if(startCol<endCol){
                for(int j=endCol-1;j>=startCol;j--){
                    arr[endRow][j] = ++number;
                }
            }
            

            if(startRow<endRow){
                for(int i=endRow-1;i>=startRow+1;i--){
                    arr[i][startCol] = ++number;
                }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return arr;
    } 
    public static void main(String args[]){
        int arr[][] = generateMatrix(4);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
