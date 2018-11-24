public class AVLTreeTest {
  public static void main(String[] args){
    AVLTree t = new AVLTree();
    t.createTestTree();
    t.print();
    System.out.println(t.inTree("10"));
  }
}
