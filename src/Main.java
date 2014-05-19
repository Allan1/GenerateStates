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
			
			line = br.readLine();
			rules.add(line);
			String[] transition = line.split(":");
			String[] partner = line.split("->");
			String right = partner[1];
			String params[] = right.split(" ");
			states.add(new State());
			states.add(new State());
			states.get(0).transitions.add(new Transition(transition[1], states.get(1),0));
			
			while(br.ready()){
				line = br.readLine();
				rules.add(line);
				partner = line.split("->");
				right = partner[1];
				params = right.split(" ");
				
				for(int i=0; i<params.length; i++){
					if(params[i].startsWith("#")){
						
					}
					else{
						
					}
				}
				System.out.println(line);
			}
			
			fr.close();
			br.close();
		}
		else{
			System.out.println("fudeu");
			System.exit(-1);
		}
	}
}
