package re.legend.utbm.gl52.lab2;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstBSTIterator<D> extends TreeIterator<D, BinaryTreeNode<D>> {

    private Queue<BinaryTreeNode<D>> queue;

    BreadthFirstBSTIterator(BinaryTreeNode<D> root) {
        this.root = root;
        this.queue = new LinkedList<>();
        queue.add(root);
    }

    @Override
    public D next() {
        if (hasNext()) {
            BinaryTreeNode<D> nextNode = queue.poll();
            if (nextNode.getLeftChild() != null) {
                queue.add(nextNode.getLeftChild());
            }
            if (nextNode.getRightChild() != null) {
                queue.add(nextNode.getRightChild());
            }
            return nextNode.getData();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
