package String;

public class demo {
public static void main(String[] args) {
    String[] a={"qqwdw","adwefe"};
    String lar=a[0];
    for(int i=1;i<a.length;i++){
        if(lar.compareTo(a[i])<0){
            lar=a[i];
        }       
    }
    System.out.println(lar);
}
}