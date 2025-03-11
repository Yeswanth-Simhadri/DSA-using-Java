package Arrays;

public class Linearsearch {
    public static int linSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int target=15;
        int[] sample={1,2,3,4,5,15};
        int res=linSearch(sample, target);
        if (res==-1) {
            System.out.println("NOT FOUND THE NUMBER");
        }else{
            System.out.println("the number at the  " +res);
        }
    }
}
