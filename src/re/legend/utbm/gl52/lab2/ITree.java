package re.legend.utbm.gl52.lab2;

import java.util.Collection;

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

    /**
     * Takes a collection and insert each element in the tree one by one
     * @see ITree#insert(D)
     * @param dataCollection the collection of data to insert
     */
    void insert(Collection<D> dataCollection);

    /**
     * Remove the given element from the tree
     * @param data the data to remoe from the tree
     */
    void remove(D data);
}