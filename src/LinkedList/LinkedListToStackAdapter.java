package LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListToStackAdapter {
    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }

        void push(int val){
            list.addFirst(val);
        }

        int pop(){
            return list.removeFirst();
        }

        int top(){
            return list.getFirst();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LLToStackAdapter st = new LLToStackAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                System.out.println(st.pop());
            } else if (str.startsWith("top")) {
                System.out.println(st.top());
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }

}
