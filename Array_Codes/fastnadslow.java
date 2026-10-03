public class fastnadslow {

    public static void main(String[] args) {

        int[] arr = {0,1, 2, 3, 4, 5};

        int slow = 0;
        int fast = 0;

        while (fast + 2 < arr.length) {

            slow++;
            fast += 2;

            System.out.println("Slow = " + arr[slow]);
            System.out.println("Fast = " + arr[fast]);
        }
    }
}