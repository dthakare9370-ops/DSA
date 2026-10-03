public class IntersectionOf_Array {

    public static int[] intersectionArray(int arr1[], int arr2[]) {

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                count++;
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;

            } else {
                j++;
            }
        }

        int result[] = new int[count];

        i = 0;
        j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                result[k++] = arr1[i];
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;

            } else {
                j++;
            }
        }

        return result;
    }

    public static void main(String args[]) {

        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 3, 6, 7, 10};

        int result[] = intersectionArray(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}