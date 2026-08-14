public class StringBufferThreadTest {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected length : " + 200000);
        System.out.println("Actual length   : " + sb.length());
    }
}