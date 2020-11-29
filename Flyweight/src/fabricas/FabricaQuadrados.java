package fabricas;

import java.util.HashMap;

import model.Quadrado;

public class FabricaQuadrados {
	
	private HashMap<String, Quadrado> quadrados;

	public FabricaQuadrados() {
		this.quadrados = new HashMap<String, Quadrado>();
	}
	
	public Quadrado getQuadrado(String cor) {
		Quadrado retorno = null;
		if(this.quadrados.containsKey(cor)) {
			retorno = this.quadrados.get(cor);
		}
		
		else {
			retorno = new Quadrado(cor);
			this.quadrados.put(cor, retorno);
			System.out.println("Criado quadrado com a cor: " + cor);
		}
		
		return retorno;
	}

}
