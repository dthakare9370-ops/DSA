package basic_hashing;

import java.util.Scanner;

public class Number_Normal_array_hash {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,2,5};
        
        int hash[] = new int[20];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        System.out.println("Enter Query : ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            int number = sc.nextInt();
            System.out.println(number +" -> "+ hash[number]);
        }
    }

}
