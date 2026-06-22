import java.util.*;


class Stack_using_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Stack : ");
        int size = sc.nextInt();

        Stack st = new Stack(size);
        
        int ch;
        do{
            System.out.println("\n*** Stack OP ****");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Stack Top Element");
            System.out.println("4.Check Empty");
            System.out.println("5.Check Full");
            System.out.println("6.Exit");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();
            switch(ch){
                case 1: 
                    System.out.println("Enter Data : ");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                case 2: 
                    st.pop();
                    break;
                case 3:
                    st.printTop();
                    break;
                case 4:
                    if(st.empty()){
                        System.out.println("Stack is Empty");
                    }else{
                        System.out.println("Stack is not empty ");
                    }
                    break;
                case 5:
                    if(st.full()){
                        System.out.println("Stack is Full");
                    }else{
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 6:
                    System.out.println("End Code");
                    break;
                default:
                    System.out.println("Invalide Choice");

            }
        }while(ch!=6);
    }
}

class Stack{
    int top;
    int size;
    int stack[];

    Stack(int size) {
        top = -1;
        stack = new int[size];
        this.size = size;
    }

    void push(int data){
        if(full()){
            System.out.println("Stack is full");
        }else{
            top++;
            stack[top] = data;
            System.out.println("Data Push Successfully !!");
        }
    }
    void pop(){
        if(empty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Pop Element is : "+stack[top]);
            top--;
        }
    }

    void printTop(){
        if(empty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top : "+stack[top]);
        }
    }

    boolean empty(){
        return (top==-1) ? true : false;
    }

    boolean full(){
        return (top==size-1) ? true : false;
    }
    
}

