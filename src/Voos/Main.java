package Voos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voo teste = new Voo("São Paulo","Rio de Janeiro", "30/12/2020");
		int assentos[] = {4, 5, 60};
		
		teste.vendeAssentos(3,assentos);;
		System.out.print(teste.numAssentosDisponiveis());
	}

}
