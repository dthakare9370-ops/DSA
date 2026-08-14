public class Valid_Palindrome {

    public static boolean isPalindrome(String s) {
        
        // s = s.toLowerCase();
        // StringBuffer sb = new StringBuffer();
        // for(int i=0 ; i<s.length(); i++){
        //     if(Character.isLetterOrDigit(s.charAt(i))){
        //         sb.append(s.charAt(i));
        //     }
        // }
        // return sb.toString().equals(sb.reverse().toString());

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            //left Special Charactor Skip
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //Right Special Charactor Skip
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        if(isPalindrome(s)){
            System.out.println("\nString Is Palindrom");
        }else{
            System.out.println("\nString is Not Palindrom ");
        }
    }
}
