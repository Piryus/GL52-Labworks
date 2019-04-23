package re.legend.utbm.gl52.lab2;

public class SimpleBSTListener<D> implements TreeListener<BinaryTreeNode<D>> {
    @Override
    public void onDataAdded(BinaryTreeNode<D> addedNode) {
        System.out.println("[Listener] A new element was added to the tree : " + addedNode.getData() + " ! Its parent node is : " + addedNode.getParent().getData() + ".");
    }
}
