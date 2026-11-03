import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class BInarySearchTree {

    Node insertIntoBST(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        if(root.data < data){
            root.right = insertIntoBST(root.right, data);
        }else{
            root.left = insertIntoBST(root.left, data);
        }

        return root;
    }

    boolean search(Node root, int data){
        if(root == null){
            return false;
        }

        if(root.data == data){
            return true;
        }

        if(root.data < data){
            return search(root.right, data);
        }else{
            return search(root.left, data);
        }
    }

    Node deleteIntoBST(Node root,int data){
        if(root == null){
            return root;
        }

        if(root.data<data){
            root.right = deleteIntoBST(root.right, data);
        }else if(root.data>data){
            root.left = deleteIntoBST(root.left, data);
        }else{

            //1. Case Leaf Node -> left & right NULL
            if(root.left == null && root.right == null){
                return null;
            }

            //2. Left not null    &  Right null
            if(root.left != null && root.right == null){
                return root.left;
            }

            //3. left null   &  right not null
            if(root.left == null && root.right != null){
                return root.right;
            }

            //4 left not null  &  right not null
            if(root.left != null && root.right != null){
                Node tempNode = minNode(root.right);
                root.data = tempNode.data;
                root.right = deleteIntoBST(root.right, tempNode.data);
            }
        }
        return root;
    }

    Node minNode(Node root){
        if(root==null){
            return root;
        }

        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    Node maxNode(Node root){
        if(root==null){
            return root;
        }
        while(root.right != null){
            root = root.right;
        }
        return root;
    }

    void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data);
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
        System.out.print(root.data + " ");
    }

    void leverOrder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node tempNode = q.poll();
            if(tempNode==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(tempNode.data + " ");
                if(tempNode.left != null){
                    q.add(tempNode.left);
                }
                if(tempNode.right != null){
                    q.add(tempNode.right);
                }
            }
        }
        
    }
    int countNode(Node root){
        if(root==null){
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }

    int heightOfTree(Node root){
        if(root==null){
            return 0;
        }

        int leftCount = heightOfTree(root.left);
        int rightCount = heightOfTree(root.right);

        return 1 + Math.max(leftCount,rightCount);
    }

    public static void main(String args[]){
        BInarySearchTree obj = new BInarySearchTree();
        Node root = null;
        Scanner sc = new Scanner(System.in);
        int choice;
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
            System.out.println("10.Count Node");
            System.out.println("11.Height Of Tree");
            System.out.println("12.Exit");
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
                    System.out.println("Enter Data for Delete : ");
                    data = sc.nextInt();
                    root = obj.deleteIntoBST(root,data);
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
                case 10:
                    int count = obj.countNode(root);
                    System.out.println("Count : "+count);
                    break;
                case 11:
                    int height = obj.heightOfTree(root);
                    System.out.println("Height : "+height);
                    break;
                default: 
                    System.out.println("Invalide Choice !!");
            }
        } while (choice!=12);

    }
}

class Node {
    Node left=null;
    int data;
    Node right=null;

    Node(int data){
        this.data = data;
    }
}