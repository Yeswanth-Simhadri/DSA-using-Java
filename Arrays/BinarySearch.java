package Arrays;

public class BinarySearch {
public static int binSearch(int[] arr, int target){
    int start=0;
    int end=arr.length-1;
    while (start<=end) {
        int mid=start+(end-start)/2;
        if (target==arr[mid]) {
            return mid;
        } else if (arr[mid]<target) {
            start=mid+1;
        }else{
            end=mid-1;
        }
        
    }
    return -1;
}
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int res=binSearch(arr,6);
        if(res==-1){
            System.out.println("The Element is not found");
        }else{
            System.out.println("the element in the"+res+"index");
        }
    }
}
