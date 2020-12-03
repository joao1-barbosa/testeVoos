package Voos;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voo teste = new Voo("São Paulo","Rio de Janeiro", "30/12/2020");
		Voo teste2 = new Voo("São Paulo","Rio de Janeiro",700, "30/12/2020", "12:30");
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		DateFormat dataf= DateFormat.getDateInstance();
		DateFormat hora = DateFormat.getTimeInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataFor = sdf.format(data);
		
		VooTester ver = new VooTester();
		
		if(!ver.verificaAtributos(teste2))
			System.out.println("Algo deu errado");
		
		VooRepository vooRep = new VooRepository();
		
		vooRep.pesquisarVoo(teste2);
		
		System.out.println(dataFor);
		System.out.println(dataf.format(data));
		System.out.println(hora.format(data));
		System.out.println(c.getTime());
		System.out.println(teste.hashCode());
		System.out.println(teste2.hashCode());
	}

}
