package re.legend.utbm.gl52.lab1;

import java.util.Iterator;

/**
 * This interface represents a classic iterator to go through a stack
 * @param <ElementT> any type of element in the stack
 */
public interface StackIterator<ElementT> {
    boolean hasNext();
    ElementT next();
}
