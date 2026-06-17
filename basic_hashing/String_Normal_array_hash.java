package basic_hashing;

import java.util.Scanner;

public class String_Normal_array_hash {
     public static void main(String[] args) {
        String str = "ganggta";
        
        int hash[] = new int[26];
        // int hash[] = new int[256];  // ASCII american Standard code for information interchage 
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }

        System.out.println("Enter Query : ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            char ch = sc.next().charAt(0);
            System.out.println(ch +" -> "+ hash[ch-'a']);
        }
    }
    
}
