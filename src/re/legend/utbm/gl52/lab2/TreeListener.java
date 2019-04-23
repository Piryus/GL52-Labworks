package re.legend.utbm.gl52.lab2;

/**
 * A class can implement the TreeListener interface when it wants to be informed of changes in TreeObservable objects.
 */
public interface TreeListener<N> {
    void onDataAdded(N addedNode);
}
