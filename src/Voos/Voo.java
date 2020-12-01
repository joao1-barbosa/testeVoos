package Voos;

public class Voo {
	//cidade de origem do voo
	private String origem;
	
	//cidade de destino
	private String destino;
	
	//valor da passagem
	private double valorPassagem;
	
	//portao de embarque do voo
	private String portao;
	
	//data do voo
	private String data;
	
	//horario do voo
	private String horario;

	
	//metodos contrutores da classe
	public Voo(String origem, String destino, double valorPassagem, String portao, String data, String horario) {
		this.origem = origem;
		this.destino = destino;
		this.valorPassagem = valorPassagem;
		this.portao = portao;
		this.data = data;
		this.horario = horario;
	}
	public Voo(String origem, String destino, double valorPassagem, String portao) {
		this(origem,destino,valorPassagem,portao, null, null);
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

	//metodos get e set do atributo portao
	public String getPortao() {
		return portao;
	}
	public void setPortao(String portao) {
		this.portao = portao;
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
}
