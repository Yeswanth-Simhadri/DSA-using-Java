package Greedy;

import java.sql.Array;
import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer[] costVer={2,1,3,1,4};
        Integer[] costHor={4,1,2};
        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());
        int h=0, v=0;
        int hp=1,vp=1;
        int cost=0;
        while (costHor.length>h && costVer.length>v) {
            if(costHor[h]>=costVer[v]){
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length) {
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while (v<costVer.length) {
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}
