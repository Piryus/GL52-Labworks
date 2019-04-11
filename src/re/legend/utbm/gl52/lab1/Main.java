package re.legend.utbm.gl52.lab1;

import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Generates an ArrayStack
        System.out.println("Creating a new ArrayStack...");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        // Generates a LinkedStack
        System.out.println("Creating a new LinkedStack...");
        LinkedStack<Integer> linkedStack = new LinkedStack<>();

        // Fills both stacks with the same integers
        int rand;
        final int stackSize = 10;
        Random random = new Random();
        for(int i = 0; i < stackSize; i++) {
            rand = random.nextInt();
            System.out.println("Adding " + rand + " to the stacks...");
            arrayStack.push(rand);
            linkedStack.push(rand);
        }

        // Creates iterators
        Iterator linkedStackIter = linkedStack.iterator();
        Iterator arrayStackIter = arrayStack.iterator();

        // Iterates through the LinkedStack
        while(linkedStackIter.hasNext()) {
            System.out.println("Top element : " + linkedStackIter.next());
        }
    }
}
