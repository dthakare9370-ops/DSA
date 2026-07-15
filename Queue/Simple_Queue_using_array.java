package Queue;
import java.util.Scanner;

class Simple_Queue_using_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Queue : ");
        int size = sc.nextInt();

        Queue st = new Queue(size);
        
        int ch;
        do{
            System.out.println("\n*** Queue OP ****");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display Rear");
            System.out.println("4.Display Front");
            System.out.println("5.Check empty");
            System.out.println("6.Check full");
            System.out.println("7.Exit");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();
            switch(ch){
                case 1: 
                    if(st.full()){
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
                    if(st.empty()){
                        System.out.println("Queue is Empty");
                    }else{
                        System.out.println("Queue is not empty ");
                    }
                    break;
                case 6:
                    if(st.full()){
                        System.out.println("Queue is Full");
                    }else{
                        System.out.println("Queue is Empty");
                    }
                    break;
                case 7:
                    System.out.println("End Code");
                    break;
                default:
                    System.out.println("Invalide Choice");

            }
        }while(ch!=7);
    }
}

class Queue{
    int front,rear;
    int size;
    int queue[];
    Queue(int size){
        front=rear=-1;
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int data){
        if(full()){
            System.out.println("Queue is Full");
            return;
        }else if(rear == - 1){
            front=rear=0;
        }else{
            rear++;
        }
        queue[rear] = data;
        System.out.println("Data Enqueue Successfully !!");
    }

    void dequeue(){
        if(empty()){
            System.out.println("Queue is Empty !!");
            return;
        }else{
            System.out.println("Dequeue Element : "+queue[front]);
            if(front==rear)
                front=rear=-1;
            else
                front++;
        }
    }

    void displayFront(){
        if(empty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Front : "+queue[front]);
        }
    }

    void displayRear(){
        if(empty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Rear : "+queue[rear]);
        }
    }

    boolean empty(){
        return (front==-1) ? true : false ;
    }

    boolean full(){
        return (rear==size-1) ? true : false ;
    }
}
