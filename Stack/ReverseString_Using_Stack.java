import java.util.*;
public class ReverseString_Using_Stack {

    public static void reverseString(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }

        System.out.println(s);
        StringBuffer sb = new StringBuffer("");
        while(!s.empty()){
            sb.append(s.pop());
        }

        System.err.println(sb.toString());
    }

    public static void main(String args[]){
        reverseString("Ganesh");
    }
}
