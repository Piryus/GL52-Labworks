package re.legend.utbm.gl52.lab2;

import java.util.Stack;

public class InorderBSTIterator<D> extends TreeIterator<D, BinaryTreeNode<D>> {

    private BinaryTreeNode<D> next;

    public InorderBSTIterator(BinaryTreeNode<D> root) {
        this.root = root;
        next = root;

        // Next element is the leftmost child of the tree
        while (next.getLeftChild() != null) {
            next = next.getLeftChild();
        }
    }

    @Override
    public D next() {
        if (hasNext()) {
            // The element that will be returned
            BinaryTreeNode<D> temp = next;

            // If the returned element has a right child, go right
            if (next.getRightChild() != null) {
                next = next.getRightChild();
                // Then go left until there isn't a left child
                while (next.getLeftChild() != null) {
                    next = next.getLeftChild();
                }
                return temp.getData();
            } else {
                while (true) {
                    // If the returned element hasn't a parent, it's the root, traversal finished
                    if (next.getParent() == null) {
                        next = null;
                        return temp.getData();
                    } else if (next.getParent().getLeftChild() == next) {
                        // If returned element is the left child of its parent, next element should be the parent
                        next = next.getParent();
                        return temp.getData();
                    } else {
                        // If it's the right child, we go back up one level
                        next = next.getParent();
                    }
                }
            }
        } else {
            return null;
        }
    }

    @Override
    boolean hasNext() {
        return next != null;
    }
}
