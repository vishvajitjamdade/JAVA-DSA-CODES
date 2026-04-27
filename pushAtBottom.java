import java.util.Stack;

public class pushAtBottom {

    static class stack1{
        public static void insertAtBottom(Stack<Integer> st,int data){
            if(st.isEmpty()){
                st.push(data);
                return;
            }

            int top = st.pop();
            insertAtBottom(st, data);
            st.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(9);

        System.out.println("Original Stack: " + stack);

        
        stack1.insertAtBottom(stack, 3);

        System.out.println("After inserting 99 at bottom: " + stack);
    }
}
