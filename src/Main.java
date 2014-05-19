import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	public static File file;
	public BufferedWriter bw;
	public static FileReader fr;
	public static BufferedReader br;
	
	public static void main() throws IOException{
		file  = new File("regras.txt");
		
		if(file.exists()){
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			
			
			fr.close();
			br.close();
		}
		else{
			System.exit(-1);
		}
	}
}
