package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalSnapsake {
    public static void main(String[] args) {
        int[] val ={60,100,120};
        int[] weight={10,20,30};
        int W=50;   
        double[][] ratio=new double[val.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int cap=W;
        double Finalval=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(cap>=weight[idx]){
                cap-=weight[idx];
                Finalval+=val[idx];
            }else{
                Finalval+=ratio[i][1]*cap;
                cap=0;
                break;
            }
        }
        System.out.println(Finalval);
    }
}
