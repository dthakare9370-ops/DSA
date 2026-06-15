public class Pattern12 {
    public static void main(String args[]) {

        int n = 4;
        int space = 2 * n - 2;

        for (int i = 1; i <= n; i++) {

            // left side
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // right side (reverse)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            space = space - 2;
        }
    }
}