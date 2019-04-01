package re.legend.utbm.gl52.lab2;

/**
 *
 */
public abstract class AbstractTree<D, N extends AbstractTreeNode<D,N>> implements ITree<D,N> {

    /**
     * The root of the tree
     */
    private ITreeNode root;
}