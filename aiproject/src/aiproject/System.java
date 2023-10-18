package aiproject;

public class System {

	Node root;
	int priceFood, priceMaterials, priceEnergy;
	int amountRequestFood, delayRequestFood;
	int amountRequestMaterials, delayRequestMaterials;
	int amountRequestEnergy, delayRequestEnergy;
	int priceBUILD1, foodUseBUILD1;
	int materialsUseBUILD1, energyUseBUILD1, prosperityBUILD1;
	int priceBUILD2, foodUseBUILD2;
	int materialsUseBUILD2, energyUseBUILD2, prosperityBUILD2;

	public System(Node root, int priceFood, int priceMaterials, int priceEnergy, int amountRequestFood,
			int delayRequestFood, int amountRequestMaterials, int delayRequestMaterials, int amountRequestEnergy,
			int delayRequestEnergy, int priceBUILD1, int foodUseBUILD1, int materialsUseBUILD1, int energyUseBUILD1,
			int prosperityBUILD1, int priceBUILD2, int foodUseBUILD2, int materialsUseBUILD2, int energyUseBUILD2,
			int prosperityBUILD2) {
		
		this.root = root;
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
	public void exNode() {
		root.RequestFood(this.amountRequestFood,this.delayRequestFood);
		root.RequestMaterials(this.amountRequestMaterials,this.delayRequestMaterials);
		root.RequestEnergy(this.amountRequestEnergy,this.delayRequestEnergy);
		root.WAIT();
		root.BUILD1(this.priceBUILD1,this.materialsUseBUILD1);
		root.BUILD2(this.prosperityBUILD2,this.materialsUseBUILD2);
	}
	
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
