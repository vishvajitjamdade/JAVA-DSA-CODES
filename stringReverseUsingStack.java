import java.util.Stack;
public class stringReverseUsingStack {

    static class stack{
        public static String reverse(String str){
            Stack<Character> st = new Stack<>();
            int idx = 0;
            while(idx<str.length()){
                st.push(str.charAt(idx));
                idx++;
            }
            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){
                char top = st.pop();
                sb.append(top);
            }

            return sb.toString();
        }
    }
    public static void main(String[] args) {
        String str = "vishvajit";
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : "+stack.reverse(str));
    }
}
