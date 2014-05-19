package states;

public class Transition {

	public String[] transition;
	public State next;
	public int pointer;
	public int reduction;
	
	public Transition(String transition, State next, int pointer){
		this.transition = transition.split(" ");
		this.next = null;
		if(this.transition.length > pointer){
			this.next = next;
			this.reduction = -1;
		}
		else{
			this.reduction = getReductionId();
		}
		
	}
	
	public int getReductionId(){
		
		return -1;
	}
}
