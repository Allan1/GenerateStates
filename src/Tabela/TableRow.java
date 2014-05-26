package Tabela;

import java.util.HashMap;

public class TableRow {

	public HashMap<String,String> row = new HashMap<String,String>();
	public String estado;
	public TableRow(int estado){
		this.estado = "e"+estado;
		//Terminais
		row.put("+", "X");
		row.put("-", "X");
		row.put("*", "X");
		row.put("/", "X");
		row.put("<", "X");
		row.put(">", "X");
		row.put("[", "X");
		row.put("]", "X");
		row.put("=", "X");
		row.put("<>", "X");
		row.put("<<", "X");
		row.put(".", "X");
		row.put(";", "X");
		row.put("@", "X");
		row.put("(", "X");
		row.put(")", "X");
		row.put("{", "X");
		row.put("}", "X");
		row.put(">=", "X");
		row.put("<=", "X");
		row.put("BINARIO", "X");
		row.put("CONTINUAR", "X");
		row.put("E", "X");
		row.put("ENQUANTO", "X");
		row.put("INTEIRO", "X");
		row.put("IMPRIMIR", "X");
		row.put("LER", "X");
		row.put("NAO", "X");
		row.put("OU", "X");
		row.put("PARAR", "X");
		row.put("REAL", "X");
		row.put("RETORNAR", "X");
		row.put("SE", "X");
		row.put("SENAO", "X");
		row.put("SIM", "X");
		row.put("VARIAVEL", "X");
		row.put("FUNCAO", "X");
		row.put("CONSTANTE", "X");

		row.put("$", "X");
		row.put("&", "X");
		//Não-terminais
		row.put("#S", "X");
		row.put("#L1", "X");
		row.put("#L2", "X");
		row.put("#L3", "X");
		row.put("#D", "X");
		row.put("#T", "X");
		row.put("#DAUX", "X");
		row.put("#VAR", "X");
		row.put("#DAUX2", "X");
		row.put("#DF", "X");
		row.put("#DFC", "X");
		row.put("#FUN", "X");
		row.put("#DS", "X");
		row.put("#CHAFUN", "X");
		row.put("#PARAMS", "X");
		row.put("#NUM", "X");
		row.put("#C", "X");
		row.put("#AT", "X");
		row.put("#OA", "X");
		row.put("#OL", "X");
		row.put("#OPO", "X");
		row.put("#OPE", "X");
		row.put("#OPOL", "X");
		row.put("#BOOL", "X");
		row.put("#OPL", "X");
		row.put("#OPL1", "X");
		row.put("#IF", "X");
		row.put("#IF2", "X");
		row.put("#WH", "X");
		row.put("#EC", "X");
		row.put("#LER", "X");
		
	}

}
