import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpa='A';
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        for (int i= 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alpa++);
            }

            System.out.println("");
        }
       sc.close(); 
    }
}
