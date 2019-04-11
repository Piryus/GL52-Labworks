package re.legend.utbm.gl52.lab2;

/**
 * This class is the highest abstraction for a tree node
 * It contains the data member and the methods it is linked to
 */
public abstract class AbstractTreeNode<D, N extends AbstractTreeNode<D,N>> implements ITreeNode<D,N> {

    /**
     * the data contained in the node
     */
    private D data;

    @Override
    public D getData() {
        return data;
    }

    @Override
    public void setData(D data) {
        this.data = data;
    }
}