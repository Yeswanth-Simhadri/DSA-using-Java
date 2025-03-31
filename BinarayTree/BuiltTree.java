package BinarayTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    public static class BinaryTree{
        static int idx=-1;
        public  static Node bulitTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=bulitTree(nodes);
            newNode.right=bulitTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }


        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>(); 
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if (!q.isEmpty()) {
                        q.add(null);
                    }else{
                        break;  
                    }
                }else{
                    System.out.print(curr.data+"");
                    if (curr.left!=null) {
                        q.add(curr.left);
                    }
                    if (curr.right!=null) {
                        q.add(curr.right);
                    }
                }
            }
        }


    }
      
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root =tree.bulitTree(nodes);
        // tree.preOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.postOrder(root);
        // System.out.println();
        tree.levelOrder(root);
    }
}
