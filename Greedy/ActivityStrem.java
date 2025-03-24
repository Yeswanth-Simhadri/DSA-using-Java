package Greedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivityStrem {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int[][] act=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }
        Arrays.sort(act,Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> arr=new ArrayList<>();

        int maxAct=1;
        arr.add(act[0][0]);
        int ends=act[0][2];
        for(int i=1;i<end.length;i++){
            if(act[i][1]>ends){
                arr.add(act[i][0]);
                ends=act[i][2];
                maxAct++;
            }
        }
        System.out.println("max"+maxAct);
        System.out.println(arr);
    }
}
