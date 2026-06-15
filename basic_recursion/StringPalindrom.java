package basic_recursion;

public class StringPalindrom {
    public static boolean recursive(String s,int left,int right){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)==s.charAt(right)){
           return recursive(s,left+1,right-1);
        }
        return false;
    }
    public static boolean palindromeCheck(String s) {
        int left = 0 , right = s.length()-1;
        return recursive(s,left,right);
    }
    public static void main(String args[]){
        System.out.println(palindromeCheck("madam"));
    }
}
