package recursion;

public class occurance {

    public static void oc(int[] arr,int n,int key,int count){
        if(n>arr.length-1){
            System.out.println(count);
            return;
        }
        if (arr[n]==key) {
            oc(arr, n+1, key, count+1);
        }else{
            oc(arr, n+1, key, count);
        }

    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,1,1};
        oc(a, 0, 1, 0);
    }
}
