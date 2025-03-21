import java.util.*;

public class DuplicatePara {
    public static boolean isDup(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;
            //closing
            if(ch==')'){
                while (s.pop() != '(') {
                    count++;
                }
                if(count<1){
                    return true;
                }
            }else{
                s.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str1="(a+b)";
        String str2="((a+b))";
        System.out.println(isDup(str2));
    }
}
