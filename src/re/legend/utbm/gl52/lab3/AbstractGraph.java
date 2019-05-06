package re.legend.utbm.gl52.lab3;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractGraph<V extends AbstractVertex> {
    // Map containing the vertices of the graph and their linked vertices
    private Map<V, List<V>> vertices;

    /**
     * Default constructor
     */
    public AbstractGraph() {
        vertices = new HashMap<>();
    }

    /**
     * @return the vertices map
     */
    public Map<V, List<V>> getVertices() {
        return vertices;
    }

    /**
     * Add a vertex to the graph
     * @param vertex the vertex to add to the graph
     * @return <code>true</code> if the vertex was added to graph; <code>false</code> otherwise
     */
    public boolean add(V vertex) {
        // TODO Implement
        return false;
    }

    public boolean addAll(Collection<V> vertices) {
        boolean 
        for (V  vertex : vertices) {

        }
    }

    /**
     * Connect two vertices together
     * @param src the source vertex
     * @param dest the destination vertex
     */
    public void connect(V src, V dest) {
        // TODO Implement
    }

}
