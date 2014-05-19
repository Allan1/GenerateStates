package states;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	public static File file;
	public BufferedWriter bw;
	public static FileReader fr;
	public static BufferedReader br;
	public static ArrayList<String> rules = new ArrayList<String>();
	public static ArrayList<State> states = new ArrayList<State>();
	
	public static void main(String[] args) throws IOException{
		file  = new File("regras.txt");
		
		if(file.exists()){
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			
			while(br.ready()){
				line = br.readLine();
				rules.add(line);
			}
			
			line = rules.get(0);
			String[] rule = line.split(":");
			String params[] = rule[1].split("->");
			String right[] = params[1].trim().split(" ");
			int currentStateId = 0;
			int pointer = 0;
			states.add(new State());//estado inicial
			
			states.add(new State());
			states.get(currentStateId).transitions.add(new Transition(rule[1], states.get(states.size()-1),pointer));
			
			for(;pointer < right.length; pointer++){
				if(right[pointer].startsWith("#")){ //Nao terminal
					for(int i=0; i < rules.size(); i++){
						String line2 = rules.get(i);
						String[] rule2 = line2.split(":");
						String[] aux = rule2[1].split("->");
						String left = aux[0].trim();
						if(left.equals(right[pointer])){
							states.add(new State());
							int pointer2 = 2;
							states.get(currentStateId).transitions.add(new Transition(rule2[1],states.get(states.size()-1),pointer2));
						}
					}
				}
				else{ //terminal
					
				}
			}
			
			
			
			
			fr.close();
			br.close();
		}
		else{
			System.out.println("fudeu");
			System.exit(-1);
		}
	}
	
	public static void generateTransitions(){
		
	}
}
