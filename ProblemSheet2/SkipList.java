class SkipList {
    private SkipListNode[] head;
    private int n = 0; // list size

    public SkipList() {
        head = new SkipListNode[5];
        n = 0;
    }


    public void createTestList() {
        SkipList list = new SkipList();
        SkipListNode anne = new SkipListNode("Anne", 3);
        SkipListNode ben = new SkipListNode("Ben", 1);
        SkipListNode charlie = new SkipListNode("Charlie", 2);
        SkipListNode don = new SkipListNode("Don", 1);
        SkipListNode ernie = new SkipListNode("Ernie", 3);

        head[4] = null;
        head[3] = null;
        head[2] = anne;
        head[1] = anne;
        head[0] = anne;

        anne.next[2] = ernie;
        anne.next[1] = charlie;
        anne.next[0] = ben;

        ben.next[0] = charlie;

        charlie.next[1] = ernie;
        charlie.next[0] = don;

        don.next[0] = ernie;

        ernie.next[2] = null;
        ernie.next[1] = null;
        ernie.next[0] = null;

        n = 5;
    }


    public void print() {
        SkipListNode[] h = head;
        for (int i = 4; i >= 0; i--) {
            while (h[i] != null) {
                if(h[i].next[i] == null){
                    // no comma behind last element
                    System.out.print(h[i].element);
                } else {
                    System.out.print(h[i].element + ", ");
                }
                h = h[i].next;
            }
            if(h[i] == null){
                h = head;
                System.out.println("");
            }
        }
    }

    public boolean inList(String s) {
        SkipListNode[] h = head;
        int i = 4;
        String e = null;
        while (e != s && i >= 0) {
            if (h[i] == null || (h[i].element).compareTo(s) > 0) {
                i--;
            } else {
                e = h[i].element;
                h = h[i].next;
                if (e.compareTo(s) == 0) {
                    return true;
                }
            }
        }
        return false;
    }


    public void insert(String s) {
        SkipListNode[] h = head;
        SkipListNode node = new SkipListNode(s);
        int l = node.next.length;
        for (int i = 4; i >= 0; i--) {
            if ( h[i] == null && i > l - 1) {
                // nothing happens, just go down: i--
            }
            else if (h[i] == null && i <= l-1){
                // found spot for inserting
                h[i] = node;
                node.next[i] = null;
            }
            else if ( (h[i].element).compareTo(node.element) > 0 && i > l - 1){
                // nothing happens, just go down: i--
            }
            else if((h[i].element).compareTo(node.element) <= 0) {
                // go right, stay in same row!
                h = h[i].next;
                i++;
            } else {
                // found spot for inserting
                SkipListNode x = h[i];
                h[i] = node;
                node.next[i] = x;
            }
        }
        n++;
    }
}




