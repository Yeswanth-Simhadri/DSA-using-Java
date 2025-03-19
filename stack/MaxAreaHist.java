import java.util.Stack;

public class MaxAreaHist {
    public static int[] nextSmallerLeft(int[] arr){
        int[] res=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=s.peek();
            }
            s.push(i);
        }

        return res;
    }
    public static int[] nextSmallerRight(int[] arr){
        int[] res=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=arr.length;
            }else{
                res[i]=s.peek();
            }
            s.push(i);
        }

        return res;
    }
    public static int largestRectangleArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        //next smaller left
        int[] nsl=nextSmallerLeft(arr);
        //next smaller right
        int[] nsr=nextSmallerRight(arr);
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            max=Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
