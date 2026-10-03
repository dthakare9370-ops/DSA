import java.util.*;

public class UnionOfArray {

    public static int[] union(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        int result[] = new int[set.size()];

        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String args[]) {

        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};

        int result[] = union(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}   