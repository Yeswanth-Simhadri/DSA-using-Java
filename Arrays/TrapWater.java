package Arrays;

public class TrapWater {
    public static int trap(int[] height) {
        int len=height.length;
        int total=0;
        int[] leftMax=new int[len];
        int[] rightMax=new int[len];
        leftMax[0]=height[0];
        rightMax[len-1]=height[len-1];
        for(int i=1;i<len;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        for(int i=len-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        for(int i=0;i<len;i++){
            total+=Math.min(rightMax[i], leftMax[i])-height[i];
        }


        return total;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(trap(arr)); 
    }
}
