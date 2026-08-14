public class Remove_suplicate_from_sorted_array {

    public static int removeDuplicate(int arr[]){
        int w = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[w] != arr[i]){
                w++;
                arr[w] = arr[i];
            }
            // arr[i] = 0;
        }
        return w+1;
    }

    public static void main(String args[]){
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
        int size = removeDuplicate(arr);
        for(int i=0;i<size;i++){
            System.out.print("\t"+arr[i]);
        }
        

    }
}
