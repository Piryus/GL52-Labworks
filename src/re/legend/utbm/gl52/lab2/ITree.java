package re.legend.utbm.gl52.lab2;

/**
 * Provides a generic interface for a tree with common methods
 * @param <D> the type of data stored in the tree
 * @param <N> the type of node used in the tree
 */
public interface ITree<D, N extends ITreeNode<D,N>> {

    /**
     * @return the number of node in the tree
     */
    int size();

    /**
     * @return the height of the tree
     */
    int getHeight();

    /**
     * @param node the node that will be the root of the tree
     */
    void setRoot(N node);

    /**
     * @return the root node of the tree
     */
    N getRoot();

    /**
     * Print the tree in the console
     */
    void print();

    /**
     * @return <code>true</code> if the tree doesn't contain any node;<code>false</code> otherwise
     */
    boolean isEmpty();

    /**
     * Insert the given data into the tree and returns the node that contains the data
     * @param data the data to add into the tree
     * @return the node containing the data in the tree
     */
    N insert(D data);
}