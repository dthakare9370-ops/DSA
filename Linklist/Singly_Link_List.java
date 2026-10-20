
import java.util.ArrayList;

class Singly_Link_List{
    Node head = null;

    void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void addMiddle(int data, int index){
        if(index < 1) {
            System.out.println("Invalid index");
            return;
        }

        if(index==1){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i=1;
        while(i<index-1 && temp != null){
            temp = temp.next;
            i++;
        }

        if(temp == null) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("Link List Is Empty");
            return;
        }
        head = head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("Link List Is Empty");
            return;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    int count(){
        if(head == null) {
            return 0;
        }

        int c=0;
        Node temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    void deleteMiddle(int index){
        if(index<1){
            System.out.println("Invalide Index");
            return;
        }
        if(index == 1){
            deleteFirst();
            return;
        }
        else if(count() == index){
            deleteLast();
            return;
        }

        int i=0;
        Node temp = head;
        while(i<index-2 && temp!=null){
            temp = temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Invalide Index");
            return;
        }
        temp.next = temp.next.next;

    }

    void display(){
        if(head == null){
            System.out.println("Link List is Empty ");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void print(Node temp){
        if(temp==null){
            System.out.print("null");
            return;
        }
        System.out.print(temp.data + " -> ");
        print(temp.next);
    }

    public int helper(int key,Node temp){
        if(temp==null){
            return -1;
        }
        if(temp.data == key){
            return 0;
        }

        int idx =  helper(key, temp.next);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    public int search(int key){
        return helper(key,head);
    }

    public void reverseLinkList(){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

     public void reverseLinkList1(){
        Node temp = head;

        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }

        temp = head;
        for(int i=list.size()-1;i>=0;i--){
            temp.data = list.get(i);
            temp = temp.next;
        }
    }

    public void deleteNthFromEnd(int index) {

        int size = count();

        if (index <= 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }

        // Delete head
        if (index == size) {
            head = head.next;
            return ;
        }

        index = size - index;

        Node temp = head;
        int i = 0;

        while (i < index - 1 && temp != null) {
            i++;
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid Index");
            return;
        }

        temp.next = temp.next.next;
    }

    public Node findMid(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom(){

        if(head==null || head.next==null){
            return true;
        }

        //Find Mid Index
        Node minIndex = findMid();

        //Reverse from mid index to end 
        Node curr = minIndex;
        Node prev = null;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        
        //Check Palidrom actual logic 
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]){
        Singly_Link_List sl = new Singly_Link_List();

        sl.addFirst(30);
        sl.addFirst(20);
        sl.addFirst(10);

        // sl.display();

        sl.addLast(20);
        sl.addLast(90);
        // sl.display();

        // sl.addMiddle(25, 6);
        // sl.display();

        // sl.deleteFirst();
        // sl.display();

        // sl.deleteLast();
        // sl.display();


        // sl.deleteMiddle(9);
        // sl.display();

        // sl.print(sl.head);

        // System.out.println(sl.search(50));

        // sl.reverseLinkList1();
        // sl.display();

        // sl.deleteNthFromEnd(5);
        sl.display();
        
        java.lang.Character.
        System.out.println(sl.checkPalindrom());
    }

}



class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
