package re.legend.utbm.gl52.lab2;

/**
 * 
 */
public class AbstractBinaryTreeNode<D, N extends AbstractBinaryTreeNode<D,N>> extends AbstractTreeNode<D,N> {

    /**
     * Default constructor
     */
    public AbstractBinaryTreeNode() {
    }

    /**
     * 
     */
    private N parent;

    /**
     * 
     */
    private N leftChild;

    /**
     * 
     */
    private N rightChild;

}