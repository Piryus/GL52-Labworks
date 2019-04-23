package re.legend.utbm.gl52.lab2;


import java.util.Collection;

/**
 * 
 */
public class BinarySearchTree<D extends Comparable<D>> extends AbstractBinarySearchTree<D, BinaryTreeNode<D>> {

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

    /**
     * Insert the given data into the tree and returns the root of the tree
     * @param data the data to add into the tree
     * @return the root of the tree
     */
    @Override
    public BinaryTreeNode<D> insert(D data) {
        BinaryTreeNode<D> newNode = insert(data, root);
        notifyListeners(newNode);
        return newNode;
    }

    private BinaryTreeNode<D> insert(D data, BinaryTreeNode<D> node) {
        if (node == null) {
            node = new BinaryTreeNode<D>(data);
            return node;
        }

        // If data is > to the one of the current node, go left else go right
        if (node.getData().compareTo(data) > 0) {
            node.leftChild = insert(data, node.getLeftChild());
        } else if (node.getData().compareTo(data) < 0) {
            node.rightChild = insert(data, node.getRightChild());
        }

        return node;
    }

    @Override
    public void insert(Collection<D> dataCollection) {
        for (D element : dataCollection) {
            insert(element);
        }
    }
}