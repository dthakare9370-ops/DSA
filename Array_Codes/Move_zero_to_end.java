
import java.util.Arrays;

public class Move_zero_to_end {
    public static void main(String[] args) {
        // int arr[] = {0, 1, 0, 3, 12};
        int arr[] = {1, 2, 0, 3};

        // Arrays.sort(arr);
        // int r = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] != 0){
        //         break;
        //     }
        //     r++;
        // }
        // for(int i=0 ; i<arr.length; i++){
        //     if(r<arr.length && arr[r] != 0){
        //         arr[i] = arr[r];
        //         arr[r] = 0;
        //         r++;
        //     }else{
        //         break;
        //     }
        // }
       

        

        //Using Two Pointer Approch 
        
        int w = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[w];
                arr[w] = arr[i];
                arr[i] = temp;
                w++;
            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.print("\t" + arr[i]);
        }
        
    }
}
