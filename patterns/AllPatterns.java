public class AllPatterns {
public static void hallowRectangle(int row,int col){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            if (i==1||i==row||j==1||j==col) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
public static void RotatedHalfPyramid(int n){   
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=n-i+1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
public static void InvertedHalfPyramidNumber(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}
public static void FloydsTriangle(int n){
    int demo =1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(demo++ +"  ");
        }
        System.out.println("");
    }
}
public static void Tringle01(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if ((i+j)%2==0) {
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println("");
    }
}
public static void butterfly(int n){
    for(int i=1;i<=n;i++){
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=n;i>=1;i--){
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }

}
public static void solidRhombas(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void hollowRhombas(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if (i==1||i==n||j==1||j==n) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void diamond(int n){
    for(int i=0;i<n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i+1;j++){
            System.out.print("*");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=n;i>=0;i--){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i+1;j++){
            System.out.print("*");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
public static void numberPyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
public static void palindromPattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }

}


    public static void main(String[] args) {
        // hallowRectangle(4,5);
        // RotatedHalfPyramid(3);
        // InvertedHalfPyramidNumber(5);
        // FloydsTriangle(5);
        // Tringle01(5);
        // butterfly(5);
        // solidRhombas(5);
        // hollowRhombas(5);
        // diamond(5);
        // numberPyramid(5);
        palindromPattern(5);
        
    }
}
