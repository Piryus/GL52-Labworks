package re.legend.utbm.gl52.lab2;

public class Main {
    public static void main(String args[]) {
        // Creates a BinaryTree
        BinaryTree<Integer, BinaryTreeNode> binaryTree = new BinaryTree<Integer, BinaryTreeNode>();
        // Creates a new node
        binaryTree.setRoot(new BinaryTreeNode<Integer, BinaryTreeNode>(58));
        binaryTree.getRoot().setLeftChild(new BinaryTreeNode<Integer, BinaryTreeNode>(40));
        binaryTree.getRoot().setRightChild(new BinaryTreeNode<Integer, BinaryTreeNode>(256));
    }
}
