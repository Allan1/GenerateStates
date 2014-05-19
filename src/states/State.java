package states;
import java.util.ArrayList;


public class State {
	
	public ArrayList<Transition> transitions;
	
	public State(){
		transitions = new ArrayList<Transition>();
	}
}
