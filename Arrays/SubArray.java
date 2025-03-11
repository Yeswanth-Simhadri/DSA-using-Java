package Arrays;

public class SubArray {
    public static void subArray(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    sum+=arr[k];
                }
                if (max<sum) {
                    max=sum;
                }
                if (min>sum) {
                    min=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
    }
    public static void subArrayprefixsum(int[] arr){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum= i==0?prefix[j]:prefix[j]-prefix[i-1];
                if (max<sum) {
                    max=sum;
                }  
            }
        }
        System.out.println("max"+max);
    }

    public static int kadans(int[] arr){
        int max = arr[0]; // Initialize max with the first element
        int cs = 0; // Current sum

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i]; // Add current element to sum
            max = Math.max(max, cs); // Update max
            
            if (cs < 0) {
                cs = 0; // Reset cs only if it's negative
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadans(arr));
    }
}
