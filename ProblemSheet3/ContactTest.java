public class ContactTest {
    public static void main(String[] args) {
        Contact one = new Contact("A", "Ba");
        Contact two = new Contact("B", "Ba");
        Contact three = new Contact("B", "Ab");
        Contact four = new Contact("Cc", "Aa");
        Contact five = new Contact ("Aaa", "Zz");

        System.out.println(one.compareTo(two));
        System.out.println(one.compareTo(three));
        System.out.println(two.compareTo(three));

        Sorter s = new Sorter();
        s.list = new Contact[3];
        s.list[0] = one;
        s.list[1] = two;
        s.list[2] = three;

        Sorter t = new Sorter();
        t.list = new Contact[5];
        t.list[0] = five;
        t.list[1] = two;
        t.list[2] = three;
        t.list[3] = four;
        t.list[4] = one;

        Sorter u = new Sorter();
        u = s;

        //t.selectionSort(t.list, 3);
        //System.out.println(t.print(t.list));

        //s.insertionSort(s.list);
        //System.out.println(s.print(s.list));

        u.quickSort(u.list, 0, 2);
        System.out.println(u.print(u.list));

        t.mergeSort(t.list, 0, 4);
        System.out.println(t.print(t.list));

    }

}
