package String;

public class ConvertLetterToUpperCase {
public static void main(String[] args) {
 String str ="hi , i am yeswanth simhadri";
 StringBuilder st=new StringBuilder("");
 char a=str.charAt(0);
 st.append(Character.toUpperCase(a));
 for(int i=1;i<str.length();i++){
    if(str.charAt(i)==' ' && i<str.length()-1){
        st.append(str.charAt(i));
        i++;
        st.append(Character.toUpperCase(str.charAt(i)));
    }else{
        st.append(str.charAt(i));
    }
 }
System.out.println(st);
}
}