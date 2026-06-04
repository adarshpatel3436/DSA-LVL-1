package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedListToQueueAdapter {

    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }

        void add(int val){
            list.addLast(val);
        }

        int remove(){
            return list.removeFirst();
        }

        int peek(){
            return list.getFirst();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LLToQueueAdapter st = new LLToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.add(val);
            } else if (str.startsWith("remove")) {
                System.out.println(st.remove());
            } else if (str.startsWith("peek")) {
                System.out.println(st.peek());
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }

}
