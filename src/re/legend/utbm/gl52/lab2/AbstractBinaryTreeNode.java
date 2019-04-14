package re.legend.utbm.gl52.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public abstract class AbstractBinaryTreeNode<D, N extends AbstractBinaryTreeNode<D,N>> extends AbstractTreeNode<D,N> {

    /**
     * the parent of the node
     */
    protected N parent;

    /**
     * the left child of the node
     */
    protected N leftChild;

    /**
     * the right child of the node
     */
    protected N rightChild;

    public void setLeftChild(N leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(N rightChild) {
        this.rightChild = rightChild;
    }

    public N getLeftChild() {
        return leftChild;
    }

    public N getRightChild() {
        return rightChild;
    }

    @Override
    public List<N> getChildren() {
        // Fills a list with both
        List<N> children = new ArrayList<>();
        if (rightChild != null) {
            children.add(rightChild);
        }
        if (leftChild != null) {
            children.add(leftChild);
        }
        return children;
    }

    @Override
    public List<N> getParents() {
        // Fills a list with the only parent of the node
        List<N> parents = new ArrayList<>();
        if (parent != null) {
            parents.add(parent);
        }
        return parents;
    }

    @Override public void setParent(N parent) {
        this.parent = parent;
    }

    /**
     * @return the parent node
     */
    public N getParent() {
        return parent;
    }

    @Override
    public boolean isLeaf() {
        return rightChild == null && leftChild == null;
    }

    @Override
    public boolean isRoot() {
        return parent == null;
    }
}