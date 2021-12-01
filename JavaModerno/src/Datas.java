import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasParis = LocalDate.of(2024, Month.JULY, 26);
		
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasParis);
		
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
		
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximasOlimpiadas.format(formatador);
		
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth mes = YearMonth.of(1992, 3);
		
		LocalTime intervalo = LocalTime.of(15, 30);
		
		System.out.println(intervalo);

	}

}
