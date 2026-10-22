
public class Stack_Using_LinkList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head = null;

        // Push: Add element at the top
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop: Remove element from the top
        void pop() {
            if (head == null) {
                System.out.println("Stack is Empty !!");
                return;
            }

            System.out.println("Popped: " + head.data);
            head = head.next;
        }

        // Peek: Display the top element
        void peek() {
            if (head == null) {
                System.out.println("Stack is Empty !!");
                return;
            }

            System.out.println("Top: " + head.data);
        }

        // Display all elements
        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();  // 30 -> 20 -> 10 -> null

        s.peek();     // Top: 30

        s.pop();      // Popped: 30

        s.display();  // 20 -> 10 -> null

        s.peek();     // Top: 20
    }
}
