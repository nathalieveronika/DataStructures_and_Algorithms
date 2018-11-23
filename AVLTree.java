//++ BINARY TREES - QUESTION 6 ++//

class AVLTree {
  AVLTreeNode root;
  //AVLTreeNode current; //might be needing this for later
  //int depth;
  //int n;

  public AVLTree() {
    root = null; current = root; n = 0; // depth = 0;
    // int size = 0;
  }

  public void createTestTree() {
    AVLTreeNode leaf_1 = new AVLTreeNode("1", null, null);
    AVLTreeNode leaf_2 = new AVLTreeNode("3", null, null);
    AVLTreeNode leaf_3 = new AVLTreeNode("5", null, null);
    AVLTreeNode leaf_4 = new AVLTreeNode("7", null, null);
    AVLTreeNode node_1 = new AVLTreeNode("2", leaf_1, leaf_2);
    AVLTreeNode node_2 = new AVLTreeNode("6", leaf_3, leaf_4);
    AVLTreeNode node_3 = new AVLTreeNode("4", node_1, node_2);

    this.root = node_3;
  }

  // Printing based on Preorder Traversal
	public void print() {
    preOrder(this.root,0);
  }

  private void preOrder(AVLTreeNode n, int height){
    if (n == null){
      return;
    }

    for(int i = 0; i < height; i++){
      System.out.print("  ");
    }

    System.out.println(n.value);

    preOrder(n.left, height+1);
    preOrder(n.right, height+1);
  }

  // public boolean inTree(String e) {
  //   // TODO implement this
  // }
  //
  // public void insert(String e) {
  //   // TODO implement this
  // }
}
