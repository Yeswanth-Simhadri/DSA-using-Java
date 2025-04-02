package BinarayTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
    public static class info2 {
        Node node;
        int hd;
        public info2(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
        
    }
    public static void topView(Node root){
        Queue<info2> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new info2(root,0));
        q.add(null);
        while(!q.isEmpty()){
            info2 curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new info2(curr.node.left, curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info2(curr.node.right, curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            Node temp=map.get(i);
            System.out.print(temp.data+" ");
        }
    }
        
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // System.out.println(diameter(root).dia);
        topView(root);
    }
}
