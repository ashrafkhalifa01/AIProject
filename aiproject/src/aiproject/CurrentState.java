package aiproject;

public class CurrentState {
	int prosperity;
	int food, materials, energy;
	int currentBalance = 100000;
	int onDelayFood = 0;
	int onDelayMaterials = 0;
	int onDelayEnergy = 0;
	boolean onDelay = false;
	
	public CurrentState(int prosperity,	int food, int materials, int energy) {
		this.prosperity = prosperity;
		this.food = food;
		this.materials = materials;
		this.energy = energy;
	}

}
