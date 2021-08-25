package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEconding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "ç";

		System.out.println(s.codePointAt(0));//Unicode

		Charset charset = Charset.defaultCharset();//encoding padrão

		System.out.println(charset.displayName());

		byte[] bytes = s.getBytes("windows-1252");

		System.out.println(bytes.length + ", windows-1252");
		
		String sNovo = new String(bytes);
		System.out.println(sNovo);

		byte[] bytes2 = s.getBytes("UTF-16");

		System.out.println(bytes2.length + ", UTF-16");
		
		String sNovo2 = new String(bytes2, "windows-1252");
		System.out.println(sNovo2);
		
		byte[] bytes3 = s.getBytes("UTF-8");

		System.out.println(bytes3.length + ", UTF-8");
		
		String sNovo3 = new String(bytes3,"windows-1252");
		System.out.println(sNovo3);
		
		
		byte[] bytes4 = s.getBytes(StandardCharsets.US_ASCII);

		System.out.println(bytes4.length + ", US_ASCII");
		
		String sNovo4 = new String(bytes4, "windows-1252");
		System.out.println(sNovo4);
		
		
		

	}

}
