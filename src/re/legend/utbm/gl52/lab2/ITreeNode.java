package re.legend.utbm.gl52.lab2;

import java.util.List;

/**
 * A generic tree node interface containing the common methods of every tree node
 * @param <D> the type of the data stored in the node
 * @param <N> the type of node used in the tree
 */
interface ITreeNode<D, N extends ITreeNode<D,N>> {

    /**
     * @return the data contained in the node
     */
    D getData();

    /**
     * @param data the data to store in the node
     */
    void setData(D data);

    /**
     * @return the list containing every children of the node
     */
    List<N> getChildren();

    /**
     * @return the list containing every parent of the node
     */
    List<N> getParents();

    /**
     * Sets node's parent
     * @param parent the parent of the node
     */
    void setParent(N parent);

    /**
     * @return <code>true</code> if the node doesn't have any child;<code>false</code> otherwise
     */
    boolean isLeaf();

    /**
     * @return <code>true</code> if the node doesn't have any parent;<code>false</code> otherwise
     */
    boolean isRoot();
}