class LinkedList {
    private ListNode head = null;
    private ListNode tail = null;
    private int n = 0; // list size

    public void add(Object o) {
        if (n == 0) {
            addFirst(o);
            tail = head;
            return;
        }
        ListNode node = tail;
        node.next = new ListNode(o,null);
        tail = node.next;
        n++;
    }

    public void addFirst(Object o) {
        head = new ListNode(o, head);
        tail = head;
        n++;

    }

    public Object get(int i) {
        if (i < 0 || i >= n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        ListNode node = head;
        for (int j = 0; j < i; j++) {
            node = node.next;
        }
        return node.element;
    }

    public void insert(Object o, int i) {
        if (i < 0 || i > n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        if (i == 0) {
            addFirst(o);
            return;
        }
        ListNode node = head;
        if (i == n){
            ListNode t = tail;
            t.next = new ListNode(o, null);
            tail = t.next;
            n++;
            return;
        }
        for (int j = 0; j < i - 1; j++) {
            node = node.next;
        }
        node.next = new ListNode(o, node.next);
        n++;

    }

    public void remove(int i) {
        if (i<0 || i>=n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        if (i==0) { // special case
            head = head.next;
            n--;
            return;
        }
        ListNode node = head;
        for (int j=0; j<i-1; j++) {
            node = node.next;
        }
        if (i == n-1){
            node.next = null;
            tail = node;
        } else {
            node.next = node.next.next;
        }
        n--;
    }
}