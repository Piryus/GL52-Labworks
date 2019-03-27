package re.legend.utbm.gl52.lab1;

/**
 * The IStack interface contains the main methods of a classic stack
 * @author Emile Legendre
 */
public interface IStack<ElementT> {
    /**
     * Adds an element on the top of the stack
     * @param t the element to put on top of the stack
     */
    void push(ElementT t);
    /**
     * Remove the last element from the stack and returns it through this method
     * @return the top element of the stack
     */
    ElementT pop();
    /**
     * @return the number of elements in the stack
     */
    int getSize();
    /**
     * Checks whether the stack is empty or not
     * @return a boolean
     */
    boolean isEmpty();
}
