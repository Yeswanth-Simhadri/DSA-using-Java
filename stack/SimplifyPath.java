import java.util.Stack;

public class SimplifyPath {
    public  static String simplifyPath(String path) {
        Stack<Character> s=new Stack<>();
        String res="/";
        for(int i=0;i<path.length();i++){
            String dir="";
            while (i<path.length() && path.charAt(i)=='/') {
                i++;
            }
            while (i<path.length() && path.charAt(i)!='/') {
                dir+=path.charAt(i);
                i++;
            }
            if (dir.equals("..") == true){
                if (!s.empty())
                s.pop();
            }
            else if (dir.equals(".") == true)
            continue;
            else if (dir.length() != 0)
            s.push(dir);

            
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    }
}
