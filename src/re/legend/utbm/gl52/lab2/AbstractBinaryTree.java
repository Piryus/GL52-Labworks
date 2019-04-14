package re.legend.utbm.gl52.lab2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */
public abstract class AbstractBinaryTree<D, N extends AbstractBinaryTreeNode<D,N>> extends AbstractTree<D,N> {
    @Override
    public int getHeight() {
        return maxHeight(root);
    }

    /**
     * Return the depth of the tree from the node given in parameter
     * @param node the root node from which we start computing depth (depth = 0)
     * @return the depth of the tree
     */
    private int maxHeight(N node) {
        if (node == null) {
            return 0;
        } else {
            // Compute max
            int rDepth = maxHeight(node.getRightChild());
            int lDepth = maxHeight(node.getLeftChild());

            if (rDepth > lDepth) {
                return rDepth + 1;
            } else {
                return lDepth + 1;
            }
        }
    }

    @Override public boolean remove(D data) {
        Queue<N> queue = new LinkedList<>();
        boolean found = false;

        queue.add(this.root);

        // Traverse the tree and delete the given element if found
        while (!queue.isEmpty()) {
            N currentNode = queue.remove();

            if (currentNode.data == data) {
                // Deepest and rightmost node in the tree
                N deepestRightmostNode = getDeepestRightmostNode();
                N parent = currentNode.getParent();
                N drParent = deepestRightmostNode.getParent();

                // Remove the deepest rightmost node from its old parent
                if (drParent.getRightChild() == deepestRightmostNode) {
                    drParent.setRightChild(null);
                } else if (drParent.getLeftChild() == deepestRightmostNode) {
                    drParent.setLeftChild(null);
                }

                // Link the current node's parent to its new child
                if (parent.getRightChild() == currentNode) {
                    parent.setRightChild(deepestRightmostNode);
                } else if (parent.getLeftChild() == currentNode) {
                    parent.setLeftChild(deepestRightmostNode);
                }

                // Link the deepest rightmost node to its new parent
                deepestRightmostNode.setParent(parent);

                // Transfer children from current node to their new parent
                if (currentNode.getLeftChild() != null) {
                    deepestRightmostNode.setLeftChild(currentNode.getLeftChild());
                    deepestRightmostNode.getLeftChild().setParent(deepestRightmostNode);
                }
                if (currentNode.getRightChild() != null) {
                    deepestRightmostNode.setRightChild(currentNode.getRightChild());
                    deepestRightmostNode.getRightChild().setParent(deepestRightmostNode);
                }

                found = true;
            }

            // Adds node's children to the queue
            if (!currentNode.getChildren().isEmpty()) {
                queue.addAll(currentNode.getChildren());
            }
        }

        return found;
    }

    /**
     * @return the deepest and rightmost node of the tree
     */
    private N getDeepestRightmostNode() {
        Queue<N> queue = new LinkedList<>();
        N currentNode = this.root;

        queue.add(this.root);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.getLeftChild() != null) {
                queue.add(currentNode.getLeftChild());
            }

            if (currentNode.getRightChild() != null) {
                queue.add(currentNode.getRightChild());
            }
        }

        return currentNode;
    }
}