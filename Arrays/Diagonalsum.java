package Arrays;

public class Diagonalsum {
    public static int diaSum(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //primary
            sum+=arr[i][i];
            if(i==arr.length-1-i){
                continue;
            }
            //secondary
            sum+=arr[i][arr.length-1-i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4,},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        System.out.println(diaSum(arr));
        }
}
