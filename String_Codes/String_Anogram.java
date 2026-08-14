import java.util.*;
public class String_Anogram {
    // public static boolean isAnagram(String str1,String str2){
        
    //     if(str1.length() == str2.length()){

    //         str1 = str1.toLowerCase();
    //         str2 = str2.toLowerCase();

    //         char[] ch1 = str1.toCharArray();
    //         char[] ch2 = str2.toCharArray();

    //         Arrays.sort(ch1);
    //         Arrays.sort(ch2);

    //         System.out.println(ch1);
    //         System.out.println(ch1);

    //         if(Arrays.equals(ch1,ch2)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }





    //Using HashMap Approch Number 2 
    public static boolean isAnagram(String str1,String str2){
        
        if(str1.length() != str2.length()){
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : str2.toCharArray()){
            
            if(!map.containsKey(ch)){
                return false ;
            }

            map.put(ch,map.get(ch)-1);

            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
    
        return map.isEmpty();
    }

    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "heart";

        if(isAnagram(str1, str2)){
            System.out.println("String is Anogram");
        }else{
            System.out.println("String is Not Anogram");
        }

    }
}
