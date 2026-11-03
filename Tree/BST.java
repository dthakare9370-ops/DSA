import java.util.*;
import java.util.Queue;
public class BST {

    Node insertIntoBST(Node root , int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        if(root.data < data){
            root.right = insertIntoBST(root.right, data);
        }else if(root.data > data){
            root.left = insertIntoBST(root.left, data);
        }
        return root;
    }

    boolean search(Node root,int ele){
        if(root==null){
            return false;
        }

        if(root.data == ele){
            return true;
        }

        if(root.data < ele){
            return search(root.right,ele);
        }else{
            return search(root.left, ele);
        }
    }

    Node deleteFromBST(Node root, int data){
        if(root==null){
            return root;
        }

        if(root.data<data){
            root.right = deleteFromBST(root.right, data);
        }else if(root.data>data){
            root.left = deleteFromBST(root.left,data);
        }else{
            
            //1 Leaf Node 
            if(root.left == null && root.right == null){
                return null;
            }

            //2.Left NULL & Right NOT Null
            if(root.left == null && root.right != null){
                return root.right;
            }

            //3. Left not Null && right NUll
            if(root.left != null && root.right == null){
                return root.left;
            }

            //Left & Right Not Null
            if(root.left != null && root.right != null){
                Node tempNode = minNode(root.right);
                root.data = tempNode.data;
                root.right = deleteFromBST(root.right, tempNode.data);
            }
        }
        return root;
    }

    Node minNode(Node root){

        while(root.left != null){
            root = root.left;
        }

        return root;

    }

    Node maxNode(Node root){

        while(root.right != null){
            root = root.right;
        }

        return root;

    }

    void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Node root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    void leverOrder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q =  new LinkedList<Node>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node tempNode = q.poll();

            

            if(tempNode != null){
                System.out.print(tempNode.data + " ");
                if(tempNode.left != null){
                    q.add(tempNode.left);
                }

                if(tempNode.right != null){
                    q.add(tempNode.right);
                }
                
            }else{
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        
        }
    }

    public static void main(String args[]){
        BST obj = new BST();
        char ch;
        Node root = null;
        int choice;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("1.Insert Into BST ");
            System.out.println("2.Search Into BST ");
            System.out.println("3.Delete Into BST ");
            System.out.println("4.Min Node");
            System.out.println("5.Max Node");
            System.out.println("6.Pre-Order");
            System.out.println("7.In-Order");
            System.out.println("8.Post-Order");
            System.out.println("9.Level Order");
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1 : 
                    System.out.println("Enter Data : ");
                    int data = sc.nextInt();
                    root = obj.insertIntoBST(root,data);
                    break;
                case 2 : 
                    System.out.println("Enter data For Search : ");
                    int val = sc.nextInt();
                    if(obj.search(root, val)){
                        System.out.println("Found !!");
                    }else{
                        System.out.println("Not Found !!");
                    }
                    break;

                case 3 :
                    System.out.println("Enter data for Delete : ");
                    data = sc.nextInt();
                    root = obj.deleteFromBST(root,data);
                    break;

                case 4 :
                    if(root!=null){
                        Node temp = obj.minNode(root);
                        System.out.println("Min Node : " + temp.data);
                    }else{
                        System.out.println("Tree Empty !!");
                    }
                    break;
                case 5 : 
                    if(root!=null){
                        Node temp = obj.maxNode(root);
                        System.out.println("Max Node : "+ temp.data);
                    }else{
                        System.out.println("Tree Empty !!");
                    }
                    break;
                case 6:
                    obj.preOrder(root);
                    System.out.println();
                    break;
                case 7:
                    obj.inOrder(root);
                    System.out.println();
                    break;
                case 8:
                    obj.postOrder(root);
                    System.out.println();
                    break;
                case 9:
                    obj.leverOrder(root);
                    break;
                default: 
                    System.out.println("Invalide Choice !!");
                
            }

            
        } while (choice!=10);
    

    }
}

class Node {
    Node left = null;
    int data;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}