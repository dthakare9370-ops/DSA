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

    public static void main(String args[]){
        Singly_Link_List sl = new Singly_Link_List();

        sl.addFirst(30);
        sl.addFirst(20);
        sl.addFirst(10);

        // sl.display();

        sl.addLast(40);
        sl.addLast(50);
        // sl.display();

        sl.addMiddle(25, 6);
        // sl.display();

        // sl.deleteFirst();
        // sl.display();

        // sl.deleteLast();
        sl.display();


        sl.deleteMiddle(9);
        sl.display();
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
