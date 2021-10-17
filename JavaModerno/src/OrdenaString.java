import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {
		
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa dos codigo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.forEach(resp->{
			System.out.println(resp);
		});
		
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);
		
		palavras.forEach(resp->{
			System.out.println(resp);
		});
		
	}

}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) {
			return -1;
		}
		if(s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
	
	
}
