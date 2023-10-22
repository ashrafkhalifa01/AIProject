package aiproject;

public class System {

	Node root;
	

	public System(Node root) {
		
		this.root = root;
		
	}
	public void expandNode(Node n) {
		n.RequestFood();
		n.RequestMaterials();
		n.RequestEnergy();
		n.WAIT();
		n.BUILD1();
		n.BUILD2();
		
	};
	
//	public void RequestFood(){
////		if(!this.currentState.onDelay ) {
////			currentState.food--;
////		}
//	}
//	
//	public void RequestMaterials(){
//		
//	}
//	public void RequestEnergy(){
//		
//	}
//	public void WAIT(){
//		
//	}
//	public void BUILD1(){
//		
//	}
//	public void BUILD2(){
//		
//	}
	
}
