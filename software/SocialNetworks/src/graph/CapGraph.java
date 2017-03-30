/**
 * 
 */
package graph;
import java.util.*;

/**
 * @author eliyooy
 * 
 * For the warm up assignment, you must implement your Graph in a class
 * named CapGraph.  Here is the stub file.
 *
 */
public class CapGraph implements Graph {

	private HashMap<Integer, MapVertex> mapVertices = new HashMap<>();
	private ArrayList<MapEdge> mapEdges = new ArrayList<>();

	/* (non-Javadoc)
	 * @see graph.Graph#addVertex(int)
	 */
	@Override
	public void addVertex(int num) {
		// TODO Auto-generated method stub
		mapVertices.putIfAbsent(num, new MapVertex(num));
	}

	/* (non-Javadoc)
	 * @see graph.Graph#addEdge(int, int)
	 */
	@Override
	public void addEdge(int from, int to) {
		// TODO Auto-generated method stub
		mapVertices.putIfAbsent(from, new MapVertex(from));
		mapVertices.putIfAbsent(to, new MapVertex(to));
		MapVertex fromVertex = mapVertices.get(from);

		MapEdge newEdge = new MapEdge(from, to);
		fromVertex.addEdges(newEdge);
		mapEdges.add(newEdge);
	}

	/* (non-Javadoc)
	 * @see graph.Graph#getEgonet(int)
	 */
	@Override
	public Graph getEgonet(int center) {
		// TODO Auto-generated method stub
		if(mapVertices.get(center) == null) {
			return new CapGraph();
		}

		CapGraph egonetGraph = new CapGraph();
		MapVertex centerVertex = mapVertices.get(center);


		egonetGraph.addVertex(center);

		for( MapEdge currEdge : centerVertex.getEdges() ) {
			egonetGraph.addEdge(currEdge.getFrom(), currEdge.getTo());
		}

		for( MapEdge currEdge : mapEdges ) {
			if(egonetGraph.mapVertices.get(currEdge.getFrom()) != null &&
					egonetGraph.mapVertices.get(currEdge.getTo()) != null && currEdge.getFrom() != center) {
				egonetGraph.addEdge(currEdge.getFrom(),currEdge.getTo());
			}
		}

		return egonetGraph;
	}

	/* (non-Javadoc)
	 * @see graph.Graph#getSCCs()
	 */
	@Override
	public List<Graph> getSCCs() {
		// TODO Auto-generated method stub
		Stack<MapVertex> vertices = new Stack<>();
		Stack<MapVertex> visited = new Stack<>();
		Stack<MapVertex> finished = new Stack<>();
		Stack<MapVertex> transposedFinished = new Stack<>();
		vertices.addAll(mapVertices.values());

		while(!vertices.isEmpty()) {
			MapVertex currVertex = vertices.pop();
			if(!visited.contains(currVertex)) {
				visitVertex(currVertex, visited, finished);
			}
		}

		CapGraph transposedGraph = new CapGraph();
		ArrayList<MapEdge> transposedEdges = transposeGraph(transposedGraph, mapEdges);
		visited.clear();

		while(!finished.isEmpty()) {
			MapVertex currVertex = finished.pop();
			if(!visited.contains(currVertex)) {
				CapGraph sccGraph = new CapGraph();
				sccGraph.addVertex(currVertex.getVertexNumber());
				visitVertexSecond(currVertex, finished, transposedFinished, transposedEdges);
			}
		}


	}

	private void visitVertex(MapVertex vertex, Stack<MapVertex> visited, Stack<MapVertex> finished) {
		visited.add(vertex);
		for( MapEdge currEdge : vertex.getEdges() ) {
			if(!visited.contains(mapVertices.get(currEdge.getTo()))) {
				visitVertex(mapVertices.get(currEdge.getTo()), visited, finished);
			}
		}
		finished.add(vertex);
	}

	private void visitVertexSecond(MapVertex vertex, Stack<MapVertex> visited, Stack<MapVertex> finished,
								   ArrayList<MapEdge> transposedEdges) {
		visited.add(vertex);
		ArrayList<MapEdge> vertexEdges = vertex.getEdges();
		ArrayList<MapEdge> transposedVertexEdges = new ArrayList<>();

		for( MapEdge currEdge : vertexEdges ) {
			for( MapEdge transposedEdge : transposedEdges ) {
				if(currEdge.getFrom() == transposedEdge.getTo() && currEdge.getTo() == transposedEdge.getFrom()) {
					transposedVertexEdges.add(transposedEdge);
				}
			}
		}

		for( MapEdge currEdge : transposedVertexEdges ) {
			if(!visited.contains(mapVertices.get(currEdge.getTo()))) {
				visitVertexSecond(mapVertices.get(currEdge.getTo()), visited, finished, transposedEdges);
			}
		}

	}

	private ArrayList<MapEdge> transposeGraph(CapGraph transposedGraph, ArrayList<MapEdge> mapEdges) {
		ArrayList<MapEdge> transposedEdges = new ArrayList<>();

		for( MapEdge currEdge : mapEdges ) {
			transposedEdges.add(new MapEdge(currEdge.getTo(), currEdge.getFrom()));
		}

		for( MapEdge currEdge : transposedEdges ) {
			transposedGraph.addEdge(currEdge.getFrom(), currEdge.getTo());
		}

		return transposedEdges;

	}

	/* (non-Javadoc)
	 * @see graph.Graph#exportGraph()
	 */
	@Override
	public HashMap<Integer, HashSet<Integer>> exportGraph() {
		// TODO Auto-generated method stub

		HashMap<Integer, HashSet<Integer>> exportMap = new HashMap<>();

		for( Integer currInt : mapVertices.keySet() ) {
			HashSet<Integer> currSet = new HashSet<>();

			for( MapEdge currEdge : mapVertices.get(currInt).getEdges()) {
				currSet.add(currEdge.getTo());
			}

			exportMap.put(currInt, currSet);
		}

		return exportMap;
	}

}
