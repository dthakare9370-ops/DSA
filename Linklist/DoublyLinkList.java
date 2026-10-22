

public class DoublyLinkList {

    Node head = null;

    void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

    }

    int count(){
        if(head==null){
            return 0;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    void addAtIndex(int data, int index){
        int size = count();
        if (index < 0 || index > size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size+1) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1;i<index-1;i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;


    }

    void removeFirst(){
        if(head == null){
            System.out.println("Link List is Empty !");
            return;
        }

        head = head.next;
        if(head != null){
            head.prev = null;
        }
    }

    void removeLast(){
        if(head == null){
            System.out.println("Link List is Empty !");
            return;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next.prev = null;
        if(temp!=null){
            temp.next = null;
        }
    }

    void removeAtIndex(int index){
        int size = count();
        if (index < 0 || index > size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size-1) {
            removeLast();
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;

        temp.next = null;
        temp.prev = null;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String args[]){
        DoublyLinkList ll = new DoublyLinkList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addAtIndex(25,3);
        // ll.removeFirst();
        // ll.removeLast();
        ll.removeAtIndex(3);
        ll.print();
        System.out.println(ll.count());
    }
}


class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}