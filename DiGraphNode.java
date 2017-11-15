package DiGraph_A5;

import java.util.HashMap;

public class DiGraphNode {
	
	private long id;
	public HashMap<String, Edge> in;
	public HashMap<String, Edge> out;
	
	public DiGraphNode(long idNum) {
		id = idNum;
		in = new HashMap<String, Edge>();
		out = new HashMap<String, Edge>();
	}
	public long getID() {
		return id;
	}
}
