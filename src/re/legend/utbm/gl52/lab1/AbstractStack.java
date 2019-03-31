package re.legend.utbm.gl52.lab1;

abstract class AbstractStack<ElementT> implements IStack<ElementT> {
    protected int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
