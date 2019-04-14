package re.legend.utbm.gl52.lab2;

import java.util.Stack;

/**
 * The AbstractTree class contains all the common methods and attributes of every trees
 */
public abstract class AbstractTree<D, N extends AbstractTreeNode<D, N>> implements ITree<D, N> {

    /**
     * The root of the tree
     */
    protected N root;

    @Override
    public N getRoot() {
        return root;
    }

    @Override
    public void setRoot(N root) {
        this.root = root;
    }

    @Override
    public int size() {
        return size(this.root) + 1;
    }

    /**
     * Return the number of nodes in a tree from the given root
     *
     * @param node the root of the tree
     * @return the number of nodes in the tree
     */
    private int size(N node) {
        int size = 0;
        if (node == null) {
            return size;
        } else {
            for (N child : node.getChildren()) {
                size += size(child) + 1;
            }
            return size;
        }
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

            System.out.print(node.getData().toString() + ", ");
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}