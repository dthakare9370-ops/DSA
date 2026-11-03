import java.util.*;

public class DuplicateParanthese {
    public static boolean isDuplicate(String s){

        // Stack<Character> st = new Stack<>();
        // int n = s.length();
        // for(int i=0;i<n;i++){
        //     //closing 
        //     char ch = s.charAt(i);
        //     if(ch==')'){
        //         // int count = 0;
        //         while(st.peek() != '('){
        //             st.pop();
        //             count++;
        //         }

        //         if(count<1){
        //             return true;
        //         }else{
        //             st.pop();
        //         }
        //     }else{
        //         st.push(ch);
        //     }
        //     //Opening , Alphabet , Expression 
        // }
        // return false;



        
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            
        }
        return false;
    }

    public static void main(String args[]){
        String str = "(a+b)";
        System.out.println(isDuplicate(str));
    }
}
