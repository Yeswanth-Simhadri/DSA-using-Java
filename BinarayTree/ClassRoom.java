package BinarayTree;

public class ClassRoom {
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
    public static class info {
     int dia;
     int h;
     public info(int dia,int h){
        this.dia=dia;
        this.h=h;
     }
    }
    public static info diameter(Node root){
        if(root==null){
            return new info(0, 0);
        }
        info leftdia=diameter(root.left);
        info rightdia=diameter(root.right);
        int finalDia=Math.max(leftdia.dia,Math.max(rightdia.dia, leftdia.h+rightdia.h+1));
        int finalHe=Math.max(leftdia.h, rightdia.h)+1;

        return new info(finalDia, finalHe);
    }
        
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter(root).dia);
    }
}
