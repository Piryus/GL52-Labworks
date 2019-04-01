package re.legend.utbm.gl52.lab2;

/**
 * 
 */
public abstract class AbstractTreeNode<D, N extends AbstractTreeNode<D,N>> implements ITreeNode<D,N> {

    /**
     * the data contained in the node
     */
    protected D data;


    @Override
    public D getData() {
        return data;
    }

    @Override
    public void setData(D data) {
        this.data = data;
    }
}