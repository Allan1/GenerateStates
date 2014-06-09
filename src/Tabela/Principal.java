package Tabela;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import states.State;
import states.Transition;

public class Principal {
	public static File file,follow;
	public BufferedWriter bw;
	public static FileReader fr,frf;
	public static BufferedReader br,brf;
	public static int estado = -1;
	public static HashMap<String,String> Mfollow = new HashMap<>();

	public static void main(String[] args) throws IOException {
		file  = new File("estados.txt");
		ArrayList<TableRow> Table = new ArrayList<TableRow>(); 


		if(file.exists()){
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			String[] frase1,frase;

			follow = new File("follow.txt");
			frf = new FileReader(follow);
			brf = new BufferedReader(frf);

			while(brf.ready()){
				line = brf.readLine();
				frase = line.split(",");
				Mfollow.put(frase[0], frase[1]);
			}
			brf.close();
			frf.close();

			while(br.ready()){
				line = br.readLine();
				if(line.startsWith("e")){
					estado++;
					Table.add(new TableRow(estado));
				}else{
					frase1 = line.split(" ");
					int tamanhofrase = frase1.length;
					for(int i = 0;i<tamanhofrase;i++){
						if(frase1[i].startsWith("@")){
							if(frase1[i].startsWith("@$")){
								Table.get(estado).row.put("$", "acc");
							}else{
								if(frase1[i].length() != 1){
									Table.get(estado).row.put(frase1[i].substring(1), frase1[tamanhofrase-1]);
									//System.out.println(frase1[i].substring(1));
									//System.out.println(frase1[tamanhofrase-1]);
								}else{
									String aux;
									if(estado == 54){
										estado = estado;
									}
									if(frase1[i-1].startsWith("#")){
										aux = Mfollow.get(frase1[i-1]);
										aux = aux.trim();
										frase = aux.split(";");
										for(int j = 0;j<frase.length;j++){
											if(!frase[j].equals("")){
												frase[j] = frase[j].trim();
												Table.get(estado).row.put(frase[j], frase1[tamanhofrase-1]); //reducao
											}
										}
									}else{
										String linha;
										linha = frase1[i-1];
										linha = linha.trim();
										Table.get(estado).row.put(linha, frase1[tamanhofrase-1]); //reducao
									}

								}
							}
						}
					}
				}

			}
			for( String key : Table.get(0).row.keySet()){
				System.out.print(key+" ");
			}
			System.out.println();
			for(int i = 0;i<Table.size();i++){
				System.out.print(Table.get(i).estado+" ");
				for( String key : Table.get(i).row.keySet()){
					System.out.print(Table.get(i).row.get(key)+" ");
				}
				System.out.println();
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