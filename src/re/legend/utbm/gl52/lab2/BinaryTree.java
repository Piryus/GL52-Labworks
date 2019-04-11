package re.legend.utbm.gl52.lab2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */
public class BinaryTree<D> extends AbstractBinaryTree<D,BinaryTreeNode<D>> {

    /**
     * Constructor with root
     * @param root the root of the tree
     */
    public BinaryTree(BinaryTreeNode<D> root) {
        this.root = root;
    }

    /**
     * Default constructor
     */
    public BinaryTree() {}

    /**
     * Find the first free slot to insert a new node with the data given
     * The function is recursive
     * The function will always try to insert on the left before trying on the right
     * @param data the data to insert
     * @param node the node from which the search for a free slot begins
     * @return the node with the inserted data
     */
    private BinaryTreeNode<D> insertFirst(D data, BinaryTreeNode<D> node) {
        // This queue will be used to store the nodes and find the first empty slot
        Queue<BinaryTreeNode<D>> queue = new LinkedList<>();

        queue.add(node);

        // Loop through the queue until it finds a free slot
        while(!queue.isEmpty()) {
            // Gets the first node in the queue...
            node = queue.peek();
            // ... and removes it from the queue
            queue.remove();

            // Checks whether the right child of this node exists...
            if (node.getLeftChild() == null) {
                // ... if it doesn't, we have find the free slot for the new node !
                node.setLeftChild(new BinaryTreeNode<D>(data, node));
                return node.getLeftChild();
            } else {
                // ... if it does, we add the child to the queue
                queue.add(node.getLeftChild());
            }

            // Same thing for the right side
            if (node.getRightChild() == null) {
                node.setRightChild(new BinaryTreeNode<D>(data, node));
                return node.getRightChild();
            } else {
                queue.add(node.getRightChild());
            }
        }

        // This shouldn't ever happen.
        return null;
    }

    @Override
    public BinaryTreeNode<D> insert(D data) {
        // If the tree is empty, simply insert the data into a root node
        if (isEmpty()) {
            root = new BinaryTreeNode<D>(data);
            return root;
        } else {
            return insertFirst(data, root);
        }
    }
}