package re.legend.utbm.gl52.lab1;

abstract class AbstractStack<ElementT> implements IStack<ElementT> {
    protected int size;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
