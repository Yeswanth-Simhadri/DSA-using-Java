package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterlinkingTwoHavlesOfQueue {
    public static void interlink(Queue<Integer> q){
        int size=q.size();
        Queue<Integer> f=new LinkedList<>();
       for(int i=0;i<size/2;i++){
        f.add(q.remove());
        }
        while (!f.isEmpty()) {
            q.add(f.remove());
            q.add(q.remove());
        }


    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        interlink(q);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}