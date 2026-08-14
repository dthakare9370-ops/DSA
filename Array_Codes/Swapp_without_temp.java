public class Swapp_without_temp {
    public static void main(String[] args) {
        //Swapp  without using the Third variable 

        int a = 2, b = 5;
        System.out.println("Before Swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        // b = a + b;
        // a = b - a;
        // b = b - a;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("After Swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }
}
