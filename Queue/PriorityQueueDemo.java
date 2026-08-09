import java.util.Collections;
import java.util.PriorityQueue;

class PriorityQueueDemo{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(40);  
        pq.add(30);
        pq.add(20);  

        // System.out.println(pq);

        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}