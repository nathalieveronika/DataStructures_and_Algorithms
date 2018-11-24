//++ BINARY TREES - QUESTION 6 ++//

class AVLTree {
  AVLTreeNode root;
  int height;
  AVLTreeNode current; //might be needing this for later
  //int depth;
  int n;

  public AVLTree() {
    root = null; current = root; n = 0; // depth = 0;
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
    this.n = 7;
    this.height = 2;
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

  public boolean inTree(String e) {
    while(this.root != null) {
      if(e.compareTo(this.root.value) == 0){
        return true;
      }
      if (e.compareTo(this.root.value) < 0){
        this.root = this.root.left;
      } else {
        this.root = this.root.right;
      }
    }
    return false;
  }

  public void basicinsert(String e){
    if(this.root == null){
      this.root = new AVLTreeNode(e, null, null);
      this.current = root;
      this.n = this.n + 1;
      return;
    }
    boolean check = false;
    while(check == false){
    // if e is grater or eqaul to current value, then check in the right subtree
      if (this.current.value.compareTo(e) <= 0){
        if (this.current.right == null){ // found the right place
          this.current.right = new AVLTreeNode(e, null, null);
          check = true;
        } else {
          this.current = this.current.right;
        }
      }
      // if e is less than current value, then check in the right subtree
      if (this.current.value.compareTo(e) > 0){
        if (this.current.left == null){
          this.current.left = new AVLTreeNode(e, null, null);
          check = true;
        }
        this.current = this.current.left;
      }
    }
    this.n = this.n + 1;
  }

//   public void insert(String e) {
//     this.insertfirst(e);
//
//
//
//
//     this.height = ;
//   }
}
// in case I don't allow duplicates
// don't allow duplicates
// if (t.current.compareTo(e) == 0){
//   return;
// }
