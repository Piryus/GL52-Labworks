package re.legend.utbm.gl52.lab2;

/**
 *
 */
public abstract class AbstractTree<D, N extends AbstractTreeNode<D,N>> implements ITree<D,N> {

    /**
     * The root of the tree
     */
    protected N root;

    /**
     * Number of nodes in the tree
     */
    private int size;

    /**
     * @return the root of the tree
     */
    public N getRoot() {
        return root;
    }

    /**
     * @param root the root of the tree to set
     */
    public void setRoot(N root) {
        this.root = root;
    }

    /**
     * @return the number of nodes in the tree
     */
    public int size() {
        return size;
    }
}