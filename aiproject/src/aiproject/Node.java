package aiproject;

import java.util.ArrayList;

public class Node {
	
	CurrentState currentState;
	Node parentNode;
	int depth;
	int pathCost;		
	Operator operator;
	
	
	public Node(Node parentNode, int prosperity,int food, int materials, int energy,Operator operator, int depth,int pathCost) {
		this.currentState = new CurrentState(prosperity,food,materials,energy);
		this.parentNode = parentNode;
		this.operator = operator;
		this.depth = depth;
		this.pathCost = pathCost;
		
	}
	public Node RequestFood(int amount,int delay,int foodPrice,int materialsPrice,int energyPrice ){
		if(!this.currentState.onDelay) {
			int actionCost=foodPrice+materialsPrice+energyPrice;
			if(actionCost<this.currentState.currentBalance) {
				int balance = this.currentState.currentBalance - actionCost;
				return new Node(this,this.currentState.prosperity,this.currentState.food,this.currentState.materials,this.currentState.energy,Operator.RequestFood,this.depth++,100000-balance);
			}
			else 
				return null;
		}else 
			return null;
	}
	
	public void RequestMaterials(int amount,int delay){
		
	}
	public void RequestEnergy(int amount,int delay){
		
	}
	public void WAIT(){
		
	}
	public void BUILD1(int price,int food,int materials,int energy,int prosperity){
		
	}
	public void BUILD2(int price,int food,int materials,int energy,int prosperity){
		
	} 

}
