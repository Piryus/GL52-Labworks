package re.legend.utbm.gl52.lab2;

/**
 * 
 */
public abstract class AbstractBinaryTree<D, N extends AbstractBinaryTreeNode<D,N>> extends AbstractTree<D,N> {

    @Override
    public int size() {
        return 0;
    }
}