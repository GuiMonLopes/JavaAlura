import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa dos codigo");
		palavras.add("caelum");

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(comparing(s -> s.length()));
		
		palavras.sort(comparing(String::length));

		System.out.println(palavras);

		palavras.forEach(resp -> {
			System.out.println(resp);
		});
		
		palavras.forEach(System.out::println);

	}

}
