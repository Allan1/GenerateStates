package states;

public class Transition {

	public String[] right;
	public State next;
	public int pointer;
	public int reduction;
	
	public Transition(String transition, State next, int pointer){
		String params[] = transition.split("->");
		this.right = params[1].split(" ");
		this.next = null;
		if(this.right.length > pointer){
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
