public class testSkipList {
    public static void main(String[] args){
        SkipList one = new SkipList();
        one.createTestList();
        one.print();
        System.out.println(one.inList("Anne"));
        System.out.println(one.inList("Ben"));
        System.out.println(one.inList("Charlie"));
        System.out.println(one.inList("Don"));
        System.out.println(one.inList("Ernie"));

        SkipList two = new SkipList();
        two.insert("Anne");
        two.insert("Anne");
        two.insert("Ben");
        two.insert("Don");
        two.insert("Chris");
        two.insert("Zeta");
        System.out.println(two.inList("Ernie"));
        System.out.println(two.inList("Tim"));
        System.out.println(two.inList("Zeta"));
        two.print();
    }
}