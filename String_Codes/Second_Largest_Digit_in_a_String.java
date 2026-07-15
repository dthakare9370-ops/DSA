
import java.util.TreeSet;

class Second_Largest_Digit_in_a_String{
    public static int secondHighest(String s) {
        TreeSet<Character> ts = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){
                ts.add(ch);
            }

            if (ts.size() > 2) {
                ts.pollFirst();
            }
            
        }

        if(ts.size()>=2){
            return ts.first()-'0';
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = secondHighest("dfa12321afd");
        System.out.println(n);
    }
}