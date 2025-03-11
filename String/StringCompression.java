package String;

public class StringCompression {
    public static int compress(char[] chars) {
        StringBuilder st=new StringBuilder("");
        for(int i=0;i<chars.length;i++){
            Integer count=1;
            char temp=chars[i];
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            st.append(temp);
            if(count>1){
                st.append(count);
            }
        }
        for(int i=0;i<st.length();i++){

            chars[i]=st.charAt(i);
        }
        System.out.println(st);
        return st.length();
    }
    public static void main(String[] args) {
        char[] arr={'a','a','b','b','b','b','b','c'};
        System.out.println(compress(arr));
    }
}
