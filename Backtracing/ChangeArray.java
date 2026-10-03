
class ChangeArray{

    public static void changeArray(int arr[], int i, int val){
        //base case
        if(arr.length == i){
            printArray(arr);
            return;
        }

        //Work 
        arr[i] = val;
        changeArray(arr,i+1,val+1);
        arr[i] = val - 2;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]); 
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        
        changeArray(arr, 0, 1);
        printArray(arr);
    }
}