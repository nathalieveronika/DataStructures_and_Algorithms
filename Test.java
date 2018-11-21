class LinkedList {
    private ListNode head = null;
    private ListNode tail = null;
    private int n = 0; // list size

    public void add(Object o) {
        if (n == 0) {
            addFirst(o);
            tail = head;
            System.out.println("function: add " + o);
            System.out.println("Head1 = " + head.element + ", Next1 = " + head.next);
            System.out.println("Tail1 = " + tail.element + ", Next1 = " + tail.next);
            System.out.println("n = "+ n);
            return;
        }
        System.out.println("function: add " + o);
        ListNode node = tail;
        System.out.println("addHead = " + head.element + ", addheadNext = " + head.next);
        node.next = new ListNode(o,null);
        tail = node.next;
        System.out.println("addHead = " + head.element + ", addNext = " + head.next);
        System.out.println("addNew Tail = " + tail.element + ", addNew Next = " + tail.next);
        n++;
        System.out.println("n = "+ n);
    }

    public void addFirst(Object o) {
        head = new ListNode(o, head);
        tail = head;
        n++;

    }

    public Object get(int i) {
        System.out.println("funtion: get object at" + i);
        if (i < 0 || i >= n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        ListNode node = head;
        for (int j = 0; j < i; j++) {
            node = node.next;
            System.out.println("for loop, j = " + j + ", node = " + node.element);
        }
        System.out.println("Return node at " + i + ": ");
        return node.element;
    }

    public void insert(Object o, int i) {
        System.out.println("funtion: insert " + o + " at " + i);
        if (i < 0 || i > n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        if (i == 0) {
            addFirst(o);
            return;
        }
        ListNode node = head;
        System.out.println("insert_node = insert_head = " + node.element);
        if (i == n){
            System.out.println("Yes, i = " + i + " equals n = " + n)  ;
            ListNode t = tail;
            t.next = new ListNode(o, null);
            tail = t.next;
            n++;
            return;
        }
        for (int j = 0; j < i - 1; j++) {
            node = node.next;
            System.out.println("for loop, j = " + j + ", i = " + i + ", node = " + node.element);
        }
        node.next = new ListNode(o, node.next);
        n++;

    }

    public void remove(int i) {
        if (i<0 || i>=n) {
            System.out.println("error: i < 0 || i >= n ");// …error!
        }
        if (i==0) { // special case
            head = head.next; n--; return;
        }
        ListNode node = head;
        for (int j=0; j<i-1; j++) {
            node = node.next;
        }
        node.next = node.next.next;
        n--;
        if(i == n-1){
            tail = new ListNode(get(n-2),null);
        }

    }
}