package Voos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voo teste = new Voo("São Paulo","Rio de Janeiro", "30/12/2020");
		Voo teste2 = new Voo("São Paulo","Rio de Janeiro",700, "30/12/2020", "12:30");
		
		System.out.println(teste.hashCode());
		System.out.println(teste2.hashCode());
	}

}
