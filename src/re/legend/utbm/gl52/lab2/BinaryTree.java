package re.legend.utbm.gl52.lab2;

/**
 * 
 */
public class BinaryTree<D> extends AbstractBinaryTree<D,BinaryTreeNode<D>> {

    /**
     * Constructor with root
     * @param root the root of the tree
     */
    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     * Default constructor
     */
    public BinaryTree() {}
}