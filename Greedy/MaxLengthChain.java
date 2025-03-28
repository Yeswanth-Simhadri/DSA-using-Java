package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int maxLength=1;
        int endIs=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(endIs<pairs[i][1]){
                maxLength++;
                endIs=pairs[i][1];
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[][] pairs = {{1,2},{7,8},{4,5}};
        System.out.println(findLongestChain(pairs));
    }
}
