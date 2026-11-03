import java.util.*;
public class CircularQueue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Queue : ");
        int size = sc.nextInt();

        Queue st = new Queue(size);
        
        int ch;
        do{
            System.out.println("\n*** Circular Queue OP ****");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display Rear");
            System.out.println("4.Display Front");
            System.out.println("5.Check empty");
            System.out.println("6.Check full");
            System.out.println("7.Print");
            System.out.println("8.Exit");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();
            switch(ch){
                case 1: 
                    if(st.isFull()){
                        System.out.println("Queue is Full");
                    }else{
                        System.out.println("Enter Data : ");
                        int data = sc.nextInt();
                        st.enqueue(data);
                    }
                    break;
                case 2: 
                    st.dequeue();
                    break;
                case 3:
                    st.displayRear();
                    break;
                case 4:
                    st.displayFront();
                    break;
                case 5:
                    if(st.isEmpty()){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println("Queue is not empty ");
                    }
                    break;
                case 6:
                    if(st.isFull()){
                        System.out.println("Queue is Full");
                    }else{
                        System.out.println("Queue is Empty");
                    }
                    break;
                case 7:
                    st.print();
                    break;
                case 8:
                    System.out.println("End Code");
                    break;
                default:
                    System.out.println("Invalide Choice");

            }
        }while(ch!=8);
    }
}


class Queue{
    int arr[];
    int size;
    int front, rear;

    Queue(int size){
        this.size = size;
        this.arr = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty(){
        return (front==-1 && rear==-1);
    }

    public boolean isFull(){
        return (rear+1)%size == front; 
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }

        if(front == -1 && rear==-1){
            front = rear = 0;
        }else{
            rear = (rear + 1) % size;
        }

        arr[rear] = data;
        System.out.println("Enqueue Data Successfully !!");
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
            return;
        }

        if(front == rear){
            front = rear = -1;
        }else{
            front = (front+1) % size;
        }
        System.out.println("Delete Successfully !!");
    }

    public void displayRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
            return;
        }else{
            System.out.println("Rear : " + arr[rear]);
        }
    }

    public void displayFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
            return;
        }else{
            System.out.println("Front : " + arr[front]);
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
            return;
        }else{
            int p = front;

            System.out.println("Queue Data : ");
            int i = front;

            // while (true) {
            //     System.out.print(arr[i] + " ");

            //     if (i == rear) {
            //         break;
            //     }

            //     i = (i + 1) % size;
            // }  

            do{
                System.out.print(arr[i] + " ");
                i = (i + 1) % size;
            }while(i!=rear);
        }
    }
    
}