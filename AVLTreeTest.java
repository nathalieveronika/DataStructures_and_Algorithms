public class AVLTreeTest {
  public static void main(String[] args){
    AVLTree t = new AVLTree();
    t.createTestTree();
    t.print();
    System.out.println(t.inTree("10"));


    t.basicinsert("10");
    t.print();

    AVLTree z = new AVLTree();
    z.basicinsert("1");
    z.basicinsert("2");
    z.print();
    System.out.println("Anzahl der Elemente in z = " + z.n);


  }
}
