package re.legend.utbm.gl52.lab1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStack<ElementT> extends AbstractStack<ElementT> implements Iterable<ElementT> {

    ArrayList<ElementT> elements = new ArrayList<>();

    // Package private to avoid generating a synthetic accessor
    private class ArrayStackIterator implements StackIterator<ElementT>, Iterator<ElementT> {

        int position = 0;

        @Override
        public boolean hasNext() {
            return elements.get(position + 1) != null;
        }

        @Override
        public ElementT next() {
            position++;
            return elements.get(position);
        }
    }

    @Override
    public Iterator<ElementT> iterator() {
        return new ArrayStackIterator();
    }

    @Override
    public void push(ElementT t) {
        this.elements.add(t);
    }

    @Override
    public ElementT pop() {
        ElementT element = this.elements.get(getSize() - 1);
        this.elements.remove(getSize() - 1);
        return element;
    }

    @Override
    public int getSize() {
        return this.elements.size();
    }

    @Override
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }
}
