package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de entrada com Arquivo
		
//		InputStream fis = new FileInputStream("arquvio.txt");
//		Reader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
		
		//FileWriter fw = new FileWriter("arquivo2.txt");
		//BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));
		
		//PrintStream ps = new PrintStream("arquivo2.txt");
		
		PrintWriter ps = new PrintWriter("arquivo2.txt", "UTF-8");
		
		ps.println("Mussum Ipsum, cacilds vidis litro abertis. Casamentiss faiz malandris se pirulito.");
		ps.println("Aenean aliquam molestie leo, vitae iaculis nisl. Leite de capivaris, leite de mula manquis sem cabeca.");
		
		//bw.write("Mussum Ipsum, cacilds vidis litro abertis. Casamentiss faiz malandris se pirulito.");
		//bw.write(System.lineSeparator());
		//bw.write(System.lineSeparator());
		//bw.write("Aenean aliquam molestie leo, vitae iaculis nisl. Leite de capivaris, leite de mula manquis sem cabeca.");
		ps.close();

	}

}
