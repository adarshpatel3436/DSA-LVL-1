package Stack;

import java.util.Stack;

public class BasicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("stack: "+st+"-> top element: "+ st.peek() + "-> Size: " + st.size());
        st.push(40);
        System.out.println("stack: "+st+"-> top element: "+ st.peek() + "-> Size: " + st.size());
        st.pop();
        System.out.println("stack: "+st+"-> top element: "+ st.peek() + "-> Size: " + st.size());
        st.pop();
        System.out.println("stack: "+st+"-> top element: "+ st.peek() + "-> Size: " + st.size());
        st.push(50);
        System.out.println("stack: "+st+"-> top element: "+ st.peek() + "-> Size: " + st.size());
        st.pop();
        st.pop();
        System.out.println("stack: "+st+"-> top element: "+ st.peek() + "-> Size: " + st.size());
        st.pop();
        System.out.println("stack: "+st+ "-> Size: " + st.size());
    }
}
