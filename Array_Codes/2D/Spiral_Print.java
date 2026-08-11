
public class Spiral_Print {
    // public List<Integer> spiralOrder(int[][] matrix) {
    public static  void spiralOrder(int[][] matrix) {

        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        
        while(startCol<=endCol && startRow<=endRow){
            
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+"\t");
            }

            //right 
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+"\t");
            }

            //buttom 
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+"\t");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startCol]+"\t");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String args[]){
        int arr[][] = {
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        spiralOrder(arr);
    }
}
