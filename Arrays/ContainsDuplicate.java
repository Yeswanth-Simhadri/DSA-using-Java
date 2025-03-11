package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean containsDuplicateHash(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }else{
                hash.add(nums[i]);
            }
        }
         return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1};
        
        System.out.println(containsDuplicateHash(arr));
    }
}