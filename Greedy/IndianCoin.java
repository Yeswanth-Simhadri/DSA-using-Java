package Greedy;

import java.util.ArrayList;

public class IndianCoin {
    public static int denominationsCount(int change){
        int notes[]={1,2,5,10,20,50,100,500,2000};
        int note=0;
        ArrayList<Integer> a=new ArrayList<>();
        int i=notes.length-1;
        while (change!=0) {
           if (change>=notes[i]) {
            change-=notes[i];
            note++;
            a.add(notes[i]);
           } else{
            i--;
             
           }
        }
        System.out.println(a);
        return note;
    }
    public static void main(String[] args) {
        int change=1521;
        System.out.println(denominationsCount(change));
    }
}
