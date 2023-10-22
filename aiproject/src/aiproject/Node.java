package aiproject;

import java.util.ArrayList;

public class Node {
	
	CurrentState currentState;
	Node parentNode;
	String operator;
	int depth;
	int pathCost;		
	int priceFood, priceMaterials, priceEnergy;
	int amountRequestFood, delayRequestFood;
	int amountRequestMaterials, delayRequestMaterials;
	int amountRequestEnergy, delayRequestEnergy;
	int priceBUILD1, foodUseBUILD1;
	int materialsUseBUILD1, energyUseBUILD1, prosperityBUILD1;
	int priceBUILD2, foodUseBUILD2;
	int materialsUseBUILD2, energyUseBUILD2, prosperityBUILD2;
	
	public Node(int prosperity,	int food, int materials, int energy, Node parentNode, String operator,int depth,int pathCost) {
		this.currentState = new CurrentState(prosperity,food,materials,energy);
	}
	public Node(Node parentNode, String operator, int depth,int pathCost,int prosperity,int food, int materials, int energy, int priceFood, int priceMaterials, int priceEnergy, int amountRequestFood,
			int delayRequestFood, int amountRequestMaterials, int delayRequestMaterials, int amountRequestEnergy,
			int delayRequestEnergy, int priceBUILD1, int foodUseBUILD1, int materialsUseBUILD1, int energyUseBUILD1,
			int prosperityBUILD1, int priceBUILD2, int foodUseBUILD2, int materialsUseBUILD2, int energyUseBUILD2,
			int prosperityBUILD2) {
		this.currentState = new CurrentState(prosperity,food,materials,energy);
		this.parentNode = parentNode;
		this.operator = operator;
		this.depth = depth;
		this.pathCost = pathCost;
		this.priceFood = priceFood;
		this.priceMaterials = priceMaterials;
		this.priceEnergy = priceEnergy;
		this.amountRequestFood = amountRequestFood;
		this.delayRequestFood = delayRequestFood;
		this.amountRequestMaterials = amountRequestMaterials;
		this.delayRequestMaterials = delayRequestMaterials;
		this.amountRequestEnergy = amountRequestEnergy;
		this.delayRequestEnergy = delayRequestEnergy;
		this.priceBUILD1 = priceBUILD1;
		this.foodUseBUILD1 = foodUseBUILD1;
		this.materialsUseBUILD1 = materialsUseBUILD1;
		this.energyUseBUILD1 = energyUseBUILD1;
		this.prosperityBUILD1 = prosperityBUILD1;
		this.priceBUILD2 = priceBUILD2;
		this.foodUseBUILD2 = foodUseBUILD2;
		this.materialsUseBUILD2 = materialsUseBUILD2;
		this.energyUseBUILD2 = energyUseBUILD2;
		this.prosperityBUILD2 = prosperityBUILD2;
	}
	public void RequestFood(){
     
	}
	
	public void RequestMaterials(){
		
	}
	public void RequestEnergy(){
		
	}
	public void WAIT(){
		
	}
	public void BUILD1(){
		
	}
	public void BUILD2(){
		
	}

}
