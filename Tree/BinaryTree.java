import java.util.*;

public class BinaryTree{
    Scanner sc = new Scanner(System.in);

    Node contructBT(Node root){
        System.out.println("Enter Data : ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        System.out.println("Do you want to add Node at Left : "+ newNode.data);
        char ch = sc.next().charAt(0);
        if(ch=='y' || ch=='Y'){
            newNode.left = contructBT(newNode.left);
        }

        System.out.println("Do you want to add Node at Right : "+ newNode.data);
        ch = sc.next().charAt(0);
        if(ch=='y' || ch=='Y'){
            newNode.right = contructBT(newNode.right);
        }

        return newNode;
    }

    //DFS - Stack 
    void preOrder(Node root){
        // data left right

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //DFS - Stack 
    void inOrder(Node root){
        // left Root Right

        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //DFS - Stack 
    void postOrder(Node root){
        // left right root
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    void levelOrder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node currNode = q.poll();

            System.out.print(currNode.data + " ");

            if(currNode.left != null){
                q.add(currNode.left);
            }

            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
    }

    int countNode(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }

    int hightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHight = hightOfTree(root.left);
        int rightHight = hightOfTree(root.right);

        return 1 + Math.max(leftHight, rightHight);
    }

    public static void main(String args[]){
        Node root = null;
        BinaryTree obj = new BinaryTree();
        root = obj.contructBT(root);

        // obj.preOrder(root);
        // System.out.println();
        // obj.inOrder(root);
        // System.out.println();
        // obj.postOrder(root);
        // System.out.println();


        // obj.levelOrder(root);
        // System.out.println();


        System.out.println(obj.countNode(root));
    }
}


class Node{
    Node left = null;
    int data;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}