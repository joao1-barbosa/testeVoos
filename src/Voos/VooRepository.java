package Voos;

import java.util.Map;
import java.util.HashMap;

public class VooRepository {
	//Mapa das características principais do Voo e seu respectivo Voo com todas as informações preenchidas
	private Map<Voo,Voo> voos;
	
	public VooRepository() {
		this.voos = new HashMap<Voo,Voo>();
	}
}
