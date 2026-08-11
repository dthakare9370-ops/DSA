import java.util.*;



public class Real_time_PriorityQueue {
    public static void main(String args[]){
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (a,b) -> a.p -  b.p
            // (a,b) -> b.p -  a.p
        ); 

        pq.add(new Patient("Dnyaneshwar", 3)); //Normal
        pq.add(new Patient("Akshay", 1));    // Critical
        pq.add(new Patient("Prathmesh", 2));   // Serious
        pq.add(new Patient("Tanmay", 3)); //Normal
        pq.add(new Patient("Vishal", 1));    // Critical
        pq.add(new Patient("Nikhil", 2));   // Serious

        while(!pq.isEmpty()){
            Patient ps = pq.poll();

            System.out.println(ps.name +"\t->\t"+ ps.p +"\t->\t"+ps.pName);
        }

    }
}

class Patient{
    String name;
    String pName;
    int p;
    
    Patient(String name, int p){
        this.name = name;
        this.p = p;
        if(p==1){
            pName = "Serious";
        }else if(p==2){
            pName = "Critical";
        }else{
            pName = "Normal";
        }
    }
}
