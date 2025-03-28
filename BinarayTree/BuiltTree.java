package BinarayTree;

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
    }
    
    
        
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root =tree.bulitTree(nodes);
        tree.preOrder(root);
    }
}
