class AVLTreeNode {
  String value;
  int balance;
  AVLTreeNode left;
  AVLTreeNode right;

  // Object or String as 1st argument? String! Otherwise comparisions in AVLTree
  // methods don't work

  AVLTreeNode(String a, AVLTreeNode b, AVLTreeNode c) {
    value = a;
    left = b;
    right = c;
  }

  // Another AVLTreeNode for rotation after inserting? No
}
