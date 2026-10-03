package basic_recursion;

public class First_occurance_return_index {
    public static int firstOccureance(int arr[], int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            // System.err.println(arr[i]);
            return i;
        }
        return firstOccureance(arr, i + 1, target);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 5, 3, 6, 3, 5 };
        System.out.println(firstOccureance(arr, 0, 5));
    }
}
