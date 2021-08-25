package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de entrada com Arquivo
		
//		InputStream fis = new FileInputStream("arquvio.txt");
//		Reader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
		
		//FileWriter fw = new FileWriter("arquivo2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));
		
		bw.write("Mussum Ipsum, cacilds vidis litro abertis. Casamentiss faiz malandris se pirulito.");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Aenean aliquam molestie leo, vitae iaculis nisl. Leite de capivaris, leite de mula manquis sem cabeca.");
		bw.close();;

	}

}
