package Arrays;

public class SearchInRotated {
    public static int minVal(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if (mid>0 && arr[mid]<arr[mid-1]) {
                return mid;
            }else if(arr[start]<=arr[mid] && arr[end]<arr[mid]){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return start;
    }
    public static int search(int[] nums,int left,int right,int target){
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while(l <= r){
        int mid = l + (r - l)/2;
        if(nums[mid] == target){
        return mid;
        }
        else if(nums[mid] > target){
        r = mid-1;
        }
        else{
        l = mid+1;
        }
        }
        return -1;
        }
    
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int min=minVal(arr);
        if (target>=arr[min] && target<=arr[arr.length-1]) {
            System.out.println(search(arr, min, arr.length-1, target)); 
        }else{
            System.out.println(search(arr, 0, min-1, target)); 
        }
    }
}
