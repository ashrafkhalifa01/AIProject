package aiproject;

import java.util.ArrayList;

public class Node {
	
	CurrentState currentState;
	Node parentNode;
	String operator;
	int depth;
	int pathCost;
		
	public Node(CurrentState currentState, Node parentNode, String operator, int depth,	int pathCost,int prosperity,	int food, int materials, int energy) {
		this.currentState = new CurrentState(prosperity,food,materials,energy);
		this.parentNode = parentNode;
		this.operator = operator;
		this.depth = depth;
		this.pathCost = pathCost;
	}
	public void RequestFood(int amount,int delay){
//		if(!this.currentState.onDelay ) {
//			currentState.food--;
//		}
	}
	
	public void RequestMaterials(int amount ,int delay){
		
	}
	public void RequestEnergy(int amount, int delay){
		
	}
	public void WAIT(){
		
	}
	public void BUILD1(int price,int materials){
		
	}
	public void BUILD2(int price, int materials){
		
	}

}
