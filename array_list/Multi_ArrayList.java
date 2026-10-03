package array_list;

import java.util.ArrayList;

public class Multi_ArrayList {
    public static void main(String args[]){
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        mainList.add(list);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(40);
        list1.add(50);
        list1.add(60);

        mainList.add(list1);

        // System.out.println(mainList);



        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> list3 = mainList.get(i);
            for(int j=0;j<list3.size();j++){
                System.out.print("\t"+list3.get(j));
            }
            System.out.println();
        }
    }
}
