public class Merger_two_Sorted_array {
    public static void merge(int nums1[], int m, int nums2[], int n){

        int temp[] = new int[n+m];

        int i=0,j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k] = nums1[i];
                i++;
                k++;
            }else{
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<m){
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k] = nums2[j];
            j++;
            k++;
        }
        i=0;
        while(i<n+m){
            nums1[i] = temp[i];
            i++;
        }
    }
    public static void main(String args[]){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        merge(nums1,3,nums2,3);
        for(int i=0;i<nums1.length;i++){
            System.out.print(" "+nums1[i]);
        }
    }
}
