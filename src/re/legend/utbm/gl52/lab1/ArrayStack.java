package re.legend.utbm.gl52.lab1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStack<ElementT> extends AbstractStack<ElementT> implements Iterable<ElementT> {

    private ArrayList<ElementT> elements = new ArrayList<>();

    private class ArrayStackIterator implements StackIterator<ElementT>, Iterator<ElementT> {

        int position = 0;

        @Override
        public boolean hasNext() {
            return position < elements.size();
        }

        @Override
        public ElementT next() {
            return elements.get(position++);
        }
    }

    @Override
    public Iterator<ElementT> iterator() {
        return new ArrayStackIterator();
    }

    @Override
    public void push(ElementT t) {
        this.elements.add(t);
        size++;
    }

    @Override
    public ElementT pop() {
        ElementT element = this.elements.get(size - 1);
        this.elements.remove(size - 1);
        size--;
        return element;
    }
}
