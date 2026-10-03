class MergeSort {

    public static void merge(int arr[], int start, int mid, int end) {

        // int n1 = mid - start + 1;
        // int n2 = end - mid;

        // int left[] = new int[n1];
        // int right[] = new int[n2];

        // for (int i = 0; i < n1; i++) {
        //     left[i] = arr[i + start];
        // }

        // for (int i = 0; i < n2; i++) {
        //     right[i] = arr[mid + 1 + i];
        // }

        // int k = start;
        // int i = 0;
        // int j = 0;

        // while (i < n1 && j < n2) {

        //     if (left[i] < right[j]) {
        //         arr[k] = left[i];
        //         i++;
        //         k++;
        //     } 
        //     else {
        //         arr[k] = right[j];
        //         j++;
        //         k++;
        //     }
        // }

        // while (i < n1) {
        //     arr[k] = left[i];
        //     i++;
        //     k++;
        // }

        // while (j < n2) {
        //     arr[k] = right[j];
        //     j++;
        //     k++;
        // }



        int size = (end - start) + 1;

        int i = start;
        int j = mid + 1;
        int k = 0;

        int temp[] = new int[size];

        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {

        if (start < end) {

            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String args[]) {

        int arr[] = {7, 4, 1, 5, 3};

        System.out.println("Before Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println();

        System.out.println("After Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}