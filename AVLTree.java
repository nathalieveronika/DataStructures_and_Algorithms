//++ BINARY TREES - QUESTION 6 ++//

class AVLTree {
  AVLTreeNode root;
  AVLTreeNode current; //might be needing this for later
  int level;

  public AVLTree() {
    root = null; current = root; int depth = 0;
    // int size = 0;
  }

  public void createTestTree() {
    AVLTree tree = new AVLTree();
    AVLTreeNode leaf_1 = new AVLTreeNode("1", null, null);
    AVLTreeNode leaf_2 = new AVLTreeNode("3", null, null);
    AVLTreeNode leaf_3 = new AVLTreeNode("5", null, null);
    AVLTreeNode leaf_4 = new AVLTreeNode("7", null, null);
    AVLTreeNode node_1 = new AVLTreeNode("2", leaf_1, leaf_2);
    AVLTreeNode node_2 = new AVLTreeNode("6", leaf_3, leaf_4);
    AVLTreeNode node_3 = new AVLTreeNode("4", node_1, node_2);

    tree.root = node_3;
    // tree.size = 7;
  }

  // Printing based on Preorder Traversal
  private void preOrder(AVLNode n){
    if (n == null){
      return;
    }
    
  }

  public void print() {
    if (root == null){
      System.out.println("The tree is empty");
    } else {
      System.out.println(current.value + " ");
      while ( current.left != null){
        for(int i = 0; i < depth; i++){
          System.out.print("  ");
        }
      if current.left != null
    }

  }

  // public boolean inTree(String e) {
  //   // TODO implement this
  // }
  //
  // public void insert(String e) {
  //   // TODO implement this
  // }
}
