package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		
		//Fluxo de saida com Arquivo
		
		OutputStream fos = new FileOutputStream("arquvio2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Mussum Ipsum, cacilds vidis litro abertis. Casamentiss faiz malandris se pirulito.");
		bw.newLine();
		bw.write("Aenean aliquam molestie leo, vitae iaculis nisl. Leite de capivaris, leite de mula manquis sem cabeca.");
		bw.close();

	}

}
