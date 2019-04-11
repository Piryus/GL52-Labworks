package re.legend.utbm.gl52.lab2;

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
}