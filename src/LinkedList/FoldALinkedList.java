package LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FoldALinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is Empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arg");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arg");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is Empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }

        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
                Node left = getNodeAt(li);
                Node rigth = getNodeAt(ri);

                int temp = left.data;
                left.data = rigth.data;
                rigth.data = temp;

                li++;
                ri--;
            }
        }

        public void reversePI() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

        public int KthFromLast(int k) {
            Node s = head;
            Node f = head;

            for (int i = 0; i < k; i++) {
                f = f.next;
            }

            while (f != tail) {
                s = s.next;
                f = f.next;
            }
            return s.data;
        }

        public int mid() {
            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList res = new LinkedList();

            while (one != null && two != null) {
                if (one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                res.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                res.addLast(two.data);
                two = two.next;
            }
            return res;
        }

        public static Node midNode(Node head, Node tail) {
            Node f = head;
            Node s = head;

            while (f != tail && f.next != tail) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }

        public static LinkedList mergeSort(Node head, Node tail) {

            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }


            Node mid = midNode(head, tail);
            LinkedList fsh = mergeSort(head, mid);                            // fsd = first sorted half
            LinkedList ssh = mergeSort(mid.next, tail);

            LinkedList cl = LinkedList.mergeTwoSortedLists(fsh, ssh);
            return cl;
        }

        public void removeDuplicates() {
            LinkedList res = new LinkedList();

            while (this.size() > 0){
                int val = this.getFirst();
                this.removeFirst();

                if( res.size() == 0 || res.tail.data != val){
                    res.addLast(val);
                }
            }
            // this = res  // not possible because this is read only
            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }

        public void oddEven(){
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();

            while (this.size() > 0){
                int val = this.getFirst();
                this.removeFirst();

                if(val % 2 == 0){
                    even.addLast(val);
                }else{
                    odd.addLast(val);
                }
            }

            if(odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if (odd.size > 0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            } else if (even.size > 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }

        public void kReverse(int k){
            LinkedList prev = null;

            while (this.size > 0){
                LinkedList curr = new LinkedList();

                if(this.size >= k)
                    for (int i = 0; i < k; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val);
                    }else{
                    int os = this.size();
                    for (int i = 0; i < os; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }
                }
                if (prev == null) {
                    prev = curr;
                }else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;
                }
            }

            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }

        private void displayReverseHelper(Node node){
            if(node == null){
                return;
            }
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
        }

        public void displayReverse(){
            displayReverseHelper(head);
            System.out.println();
        }

        private void reversePRHelper(Node node){
            if(node == null){
                return;
            }
            reversePRHelper(node.next);
            if(node == tail){
                // nothing to do
            }else {
                node.next.next = node;
            }
        }

        public void reversePR(){
            reversePRHelper(head);
            head.next = null;
            Node temp = head;
            head = tail;
            tail = temp;
        }

        public void reverseDRHelper(Node right, int floor){
            if(right == null){
                return;
            }
            reverseDRHelper(right.next, floor + 1);
            if(floor >= size / 2){
                int temp = right.data;
                right.data = rleft.data;
                rleft.data = temp;

                rleft = rleft.next;
            }
        }

        Node rleft;
        public void reverseDR(){
            rleft = head;
            reverseDRHelper(head, 0);
        }

        private boolean isPalindormeHelper(Node right){
            if(right == null){
                return true;
            }
            boolean rres = isPalindormeHelper(right.next);
            if(rres == false){
                return false;
            } else if (pleft.data != right.data) {
                return false;
            }else {
                pleft = pleft.next;
                return true;
            }
        }

        Node pleft;     // palindrome left
        public boolean isPalindorme(){
            pleft = head;
            return isPalindormeHelper(head);
        }

        private void foldHelper(Node right, int floor){
            if(right == null){
                return;
            }
            foldHelper(right.next, floor+1);
            if(floor > size/2) {
                Node temp = fleft.next;
                fleft.next = right;
                right.next = temp;
                fleft = temp;
            }else if (floor == size / 2){
                tail = right;
                tail.next = null;
            }

        }

        Node fleft;
        public void fold(){
            fleft = head;
            foldHelper(head, 0);

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter size of list: ");
        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();

        System.out.print("enter value: ");
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

//      int n2 = Integer.parseInt(br.readLine());
//      LinkedList l2 = new LinkedList();
//
//      String[] values2 = br.readLine().split(" ");
//      for (int i = 0; i < n2; i++) {
//          int d = Integer.parseInt(values2[i]);
//          l2.addLast(d);
//      }

//      LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);
//      merged.display();

//      LinkedList sorted = LinkedList.mergeSort(l1.head, l1.tail);
//      sorted.display();

//      l1.display();
//      l2.display();

//       System.out.print("enter k: ");
//       int k = Integer.parseInt(br.readLine());

        System.out.print("list before: ");
        l1.display();
        //l1.removeDuplicates();
        //l1.oddEven();
        //l1.kReverse(k);
        //l1.displayReverse();
        //l1.reversePR();
        //l1.reverseDR();
        //System.out.println(l1.isPalindorme());
        l1.fold();
        System.out.print("List after : ");
        l1.display();
    }
}

