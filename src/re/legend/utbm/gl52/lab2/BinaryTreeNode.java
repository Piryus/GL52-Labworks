package re.legend.utbm.gl52.lab2;

/**
 * 
 */
public class BinaryTreeNode<D, N extends BinaryTreeNode<D,N>> extends AbstractBinaryTreeNode<D,N> {

    /**
     * Constructor with parent
     */
    public BinaryTreeNode(D data, N parent) {
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