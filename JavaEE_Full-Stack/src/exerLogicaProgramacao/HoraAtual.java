package exerLogicaProgramacao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraAtual {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
		String dataFormatada = sdf.format(hora);
		
	
	}

}
