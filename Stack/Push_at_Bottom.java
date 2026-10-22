import java.util.*;
public class Push_at_Bottom {
    public static void addBottom(Stack<Integer> s, int data){

        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        addBottom(s,data);
        s.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        
    
        System.out.println(s);
        addBottom(s, 40);
         System.out.println(s);

    }
}
