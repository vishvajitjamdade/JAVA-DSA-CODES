import java.util.Stack;

public class reverseStack {

    static class stack{
        public static void reverse(Stack<Integer> stack){
            if(stack.isEmpty()){
                return;
            }

            int top = stack.pop();
            reverse(stack);
            pushAtBottom(stack, top);
        }

        public static void pushAtBottom(Stack<Integer> st,int data){
            if(st.isEmpty()){
                st.push(data);
                return;
            }

            int top = st.pop();
            pushAtBottom(st, data);
            st.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Original Stack: " + st);

        stack.reverse(st);

        System.out.println("Reversed Stack: " + st);
    }
}
