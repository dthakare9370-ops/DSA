import java.util.*;

public class Reverse_Stack {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
