package re.legend.utbm.gl52.lab2;

import java.util.List;

/**
 * 
 */
public class AbstractTreeNode<D, N extends AbstractTreeNode<D,N>> implements ITreeNode<D,N> {

    /**
     * Default constructor
     */
    public AbstractTreeNode() {
    }

    /**
     * 
     */
    private D data;


    @Override
    public D getData() {
        return null;
    }

    @Override
    public void setData(D data) {

    }

    @Override
    public List<N> getChildren() {
        return null;
    }


    @Override
    public List<N> getParents() {
        return null;
    }


    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isRoot() {
        return false;
    }
}