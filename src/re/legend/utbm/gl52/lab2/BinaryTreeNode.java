package re.legend.utbm.gl52.lab2;

/**
 * 
 */
public class BinaryTreeNode<D> extends AbstractBinaryTreeNode<D,BinaryTreeNode<D>> {

    /**
     * Constructor with parent
     */
    public BinaryTreeNode(D data, BinaryTreeNode<D> parent) {
        this.data = data;
        this.parent = parent;
    }

    /**
     * Constructor without parent
     */
    public BinaryTreeNode(D data) {
        this.data = data;
    }
}