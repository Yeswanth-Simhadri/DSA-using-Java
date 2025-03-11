import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int[] temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei) {
            if(arr[i]< arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
       
            while(j<=ei){
                temp[k++]=arr[j++];
            }
            while(i<=mid){
                temp[k++]=arr[i++];
            }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,23,45,83,44};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
