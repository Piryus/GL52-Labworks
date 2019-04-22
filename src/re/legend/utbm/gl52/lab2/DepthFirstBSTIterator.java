package re.legend.utbm.gl52.lab2;

import java.util.Stack;

public class DepthFirstBSTIterator<D> extends TreeIterator<D, BinaryTreeNode<D>> {

    private Stack<BinaryTreeNode<D>> stack;

    public DepthFirstBSTIterator(BinaryTreeNode<D> root) {
        this.root = root;
        this.stack = new Stack<>();
        this.stack.add(root);
    }

    @Override
    public D next() {
        BinaryTreeNode<D> nextNode = stack.pop();
        if (nextNode.getRightChild() != null) {
            stack.add(nextNode.getRightChild());
        }
        if (nextNode.getLeftChild() != null) {
            stack.add(nextNode.getLeftChild());
        }
        return nextNode.getData();
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }
}
