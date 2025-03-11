package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp<rp) {
            if (list.get(rp)+list.get(lp)==target) {
                return true;
            }else if (list.get(rp)+list.get(lp)>target) {
                rp--;
            }else{
                lp++;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(pairSum(arr,60));
    }
}
