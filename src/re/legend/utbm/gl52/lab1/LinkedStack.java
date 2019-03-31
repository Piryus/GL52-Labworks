package re.legend.utbm.gl52.lab1;

import java.util.Iterator;

public class LinkedStack<ElementT> extends AbstractStack<ElementT> implements Iterable {

    private Node first;

    private class Node {
        Node() {
            this.element = null;
            this.next = null;
        }

        private ElementT element;
        private Node next;
    }

    private class LinkedStackIterator implements StackIterator<ElementT>, Iterator<ElementT> {

        private Node currentNode;

        LinkedStackIterator(Node head) {
            this.currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return this.currentNode.next != null;
        }

        @Override
        public ElementT next() {
            this.currentNode = this.currentNode.next;
            return this.currentNode.element;
        }
    }

    @Override
    public Iterator<ElementT> iterator() {
        return new LinkedStackIterator(this.first);
    }

    @Override
    public void push(final ElementT newElement) {
        final Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;
        first.element = newElement;
        size++;
    }

    @Override
    public ElementT pop() {
        final ElementT elementToPop = first.element;
        this.first = first.next;
        size--;
        return elementToPop;
    }
}
