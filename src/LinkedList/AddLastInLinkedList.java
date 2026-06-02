package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;

public class AddLastInLinkedList {
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

    }
    public static void testList(LinkedList list) {

        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println("Data: " + temp.data);
        }

        System.out.println("Size: " + list.size);

        if (list.size > 0) {
            System.out.println("Tail Data: " + list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList list = new LinkedList();
        String str = br.readLine();

        while (str.equals("quit") == false) {

            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }

            str = br.readLine();
        }

        testList(list);
    }
}

// input
// addLast 10
// addLast 20
// addLast 30
//quit