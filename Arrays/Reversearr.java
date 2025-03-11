package Arrays;

import java.util.Arrays;

public class Reversearr {
    public static void main(String[] args) {
        int[] arra={1,2,3,4,5,6,7};
        int start=0;
        int end=arra.length-1;
        while (start<end) {
            int temp=arra[start];
            arra[start]=arra[end];
            arra[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arra));
    }
}
