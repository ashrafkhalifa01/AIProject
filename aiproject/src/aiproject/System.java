package aiproject;

public class System {

	Node root;
	
	
	public System(String initialState) {
		
		
		
	}
	public void expandNode(Node n) {
		n.RequestFood();
		n.RequestMaterials();
		n.RequestEnergy();
		n.WAIT();
		n.BUILD1();
		n.BUILD2();
		
	};

	
}
