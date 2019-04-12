package re.legend.utbm.gl52.lab2;

import java.util.ArrayList;

import static java.util.Arrays.asList;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        // Creates a BinaryTree
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        // Sets the root of the tree
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(58);
        binaryTree.setRoot(root);
        // Adds a left child to the root
        BinaryTreeNode<Integer> rootLeftChild = new BinaryTreeNode<>(40);
        root.setLeftChild(rootLeftChild);
        // Adds a right child to the root
        BinaryTreeNode<Integer> rootRightChild = new BinaryTreeNode<>(256);
        root.setRightChild(rootRightChild);
        // ... repeat until we have a nice tree !
        rootRightChild.setRightChild(new BinaryTreeNode<>(5145));
        rootLeftChild.setRightChild(new BinaryTreeNode<>(125));
        BinaryTreeNode<Integer> child = rootRightChild.getRightChild();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            child.setRightChild(new BinaryTreeNode<>(random.nextInt()));
            child.setLeftChild(new BinaryTreeNode<>(random.nextInt()));
            if (i % 2 == 0) {
                child = child.getLeftChild();
            } else {
                child = child.getRightChild();
            }
        }
        binaryTree.print();
        System.out.println("First tree height : " + binaryTree.getHeight());

        // Now let's use the insert function to fill a new tree
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(10);
        binaryTree2.insert(new ArrayList<>(asList(10, 50, 48945, 897, 4897, 26, 5456, 4, 54, 4, 84, 84)));
        binaryTree2.print();
        System.out.println("Second tree height : " + binaryTree2.getHeight());
        System.out.println("Second tree size : " + binaryTree2.size());
    }
}
