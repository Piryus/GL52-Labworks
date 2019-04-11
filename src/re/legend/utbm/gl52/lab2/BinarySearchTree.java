package re.legend.utbm.gl52.lab2;


import java.util.Collection;

/**
 * 
 */
public class BinarySearchTree<D> extends AbstractBinarySearchTree<D, BinaryTreeNode<D>> {

    /**
     * Default constructor
     */
    public BinarySearchTree() {}

    /**
     * Constructor with root
     * @param root the root of the tree
     */
    public BinarySearchTree(BinaryTreeNode<D> root) {
        this.root = root;
    }

    @Override
    public BinaryTreeNode<D> insert(D data) {
        return null;
    }

    @Override
    public void insert(Collection<D> dataCollection) {}
}