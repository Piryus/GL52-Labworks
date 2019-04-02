package re.legend.utbm.gl52.lab2;

import java.util.Stack;

/**
 *
 */
public abstract class AbstractTree<D, N extends AbstractTreeNode<D,N>> implements ITree<D,N> {

    /**
     * The root of the tree
     */
    protected N root;

    /**
     * Number of nodes in the tree
     */
    private int size;

    /**
     * @return the root of the tree
     */
    public N getRoot() {
        return root;
    }

    /**
     * @param root the root of the tree to set
     */
    public void setRoot(N root) {
        this.root = root;
    }

    /**
     * @return the number of nodes in the tree
     */
    public int size() {
        return size;
    }

    @Override
    public void print() {
        Stack<N> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            N node = stack.pop();

            if (!node.getChildren().isEmpty()) {
                for (N child : node.getChildren()) {
                    stack.push(child);
                }
            }

            System.out.println(node.getData().toString());
        }
    }
}