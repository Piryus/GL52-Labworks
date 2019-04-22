package re.legend.utbm.gl52.lab2;

/**
 * Abstract class containing the most common methods of a tree iterator
 * @param <D> the type of data contained in the iterated tree
 */
public abstract class TreeIterator<D, N extends AbstractTreeNode<D, N>> {

    /**
     * The root of the explored tree
     */
    N root;

    /**
     * Return the next element in the tree
     */
    abstract D next();

    /**
     * @return <code>true</code> if traversal has not finished; <code>false</code> otherwise
     */
    abstract boolean hasNext();
}
