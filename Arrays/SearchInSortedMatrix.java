package Arrays;

public class SearchInSortedMatrix {
    public static void search(int[][] mat,int target){
        int row=0;
        int col=mat[0].length-1;
        while (row<mat.length && col>=0) {
            if(mat[row][col]==target){
                System.out.println("row:"+row+"col:"+col);
                return;
            }else if(target<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("The element is not found");
    }

    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        search(arr,13);
    }
    
}