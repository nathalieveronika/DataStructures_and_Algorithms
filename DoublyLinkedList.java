class DoublyLinkedList {
    private ListNode2 head = null;
    private int n = 0; // list size

    public void addFirst(Object o) {
        if (n == 0){
            head = new ListNode2(o, null, head);
            n++;
            return;
        }
        head.prev = new ListNode2(o, null, head);
        head = head.prev;
        n++;
    }

    public Object get(int i) {
        if (i < 0 || i >= n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        ListNode2 node = head;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node.element;
    }

    public void insert(Object o, int i) {
        if (i < 0 || i > n) {
            System.out.println("error: i < 0 || i > n ");// …error!
        }
        if (i == 0) {
            addFirst(o);
            return;
        }
        ListNode2 node1 = head;
        ListNode2 node2 = head.next;
        for (int j = 0; j < i - 1; j++) {
            node1 = node1.next;
            node2 = node2.next;
        }
        if(i == n) {
            node1.next = new ListNode2(o, node1, node2);
            n++;
            return;
        }
        node1.next = new ListNode2(o, node1, node2);
        node2.prev = node1.next;
        n++;
    }

    public void remove(int i) {
        if (i<0 || i>=n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        if(i==0 && n == 1){ // special case 1
            head = null;
            n--; // n = 0;
            return;
        }
        if (i==0 && n != 1) { // special case 2
            head = head.next;
            head.prev = null;
            n--;
            return;
        }
        ListNode2 node1 = head;
        ListNode2 node2 = head.next;
        for (int j=0; j<i-1; j++) {
            node1 = node1.next;
            node2 = node2.next;
        }
        if (i == n-1) {  // special case 3
            node1.next = null;
            n--;
            return;
        }
        node1.next = node2.next;
        node2.next.prev = node1;
        n--;
    }


    /**
     * Prints out the elements in the list from the first to the last (front to back) and then from the last to the first
     * (back to front). This is useful to test whether the list nodes are connected correctly with next and prev references.
     */
    public void print() {
        // no elements to print for empty list
        if (head == null) {
            System.out.println("list empty.");
            return;
        }

        // follow next references to list elements from the front to the back of the list
        System.out.print("front to back: ");
        ListNode2 node = head;
        System.out.print(node.element + " ");
        while (node.next != null) {
            node = node.next;
            System.out.print(node.element + " ");
        }

        // follow prev references to list elements from the back to the front of the list
        System.out.print("-- and back to front: ");
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.prev;
        }
        System.out.println();
    }
}
