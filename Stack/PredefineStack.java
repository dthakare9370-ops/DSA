
import java.util.*;

public class PredefineStack {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.peek());
        System.out.println(s.empty());

        System.out.println(s);
        System.out.println(s.search(40));

        System.out.println(s.size());

        System.out.println(s.contains(10));

        System.out.println(s.get(3));

    }
}
