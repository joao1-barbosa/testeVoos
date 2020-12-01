package Voos;

public class Voo {
	private static final int NUM_ASSENTOS = 60;
	
	//cidade de origem do voo
	private String origem;
	
	//cidade de destino
	private String destino;
	
	//valor da passagem
	private double valorPassagem;
	
	//data do voo
	private String data;
	
	//horario do voo
	private String horario;
	
	/**Assentos disponiveis no voo;
	 * true = assento disponível
	 * false = assento não disponível
	 */
	private boolean assentos[] = new boolean[NUM_ASSENTOS];
	
	
	//metodos contrutores da classe
	public Voo(String origem, String destino, double valorPassagem, String data, String horario) {
		this.origem = origem;
		this.destino = destino;
		this.valorPassagem = valorPassagem;
		this.data = data;
		this.horario = horario;
		geraAssentos();
	}
	public Voo(String origem, String destino, double valorPassagem, String horario) {
		this(origem,destino,valorPassagem, null, horario);
	}
	
	
	//metodos get e set do atributo origem
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	//metodos get e set do atributo destino
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

	//metodos get e set do atributo valorPassagem
	public double getValorPassagem() {
		return valorPassagem;
	}
	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	//metodos get e set do atributo data
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	//metodos get e set do atributo horario
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	//metodos get e set do atributo assentos
	public boolean[] getAssentos() {
		return assentos;
	}
	public void setAssentos(boolean assentos[]) {
		this.assentos = assentos;
	}
	
	//metodo que define todos os assentos do voo com true, ou seja disponíveis
	private void geraAssentos() {
		int i;
		for(i=0;i<NUM_ASSENTOS;i++) {
			this.assentos[i] = true;
		}
	}
	
	
	@Override
	public int hashCode() {
		return this.destino.hashCode();
	}
}
