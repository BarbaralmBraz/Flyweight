package model;

public class Quadrado {
	
	private int tamanhoLados1;
	private int tamanhoLados2;
	private String cor;
	
	public Quadrado(String cor) {
		this.cor = cor;
	}

	public int getTamanhoLados1() {
		return tamanhoLados1;
	}

	public void setTamanhoLados1(int tamanhoLados1) {
		this.tamanhoLados1 = tamanhoLados1;
	}

	public int getTamanhoLados2() {
		return tamanhoLados2;
	}

	public void setTamanhoLados2(int tamanhoLados2) {
		this.tamanhoLados2 = tamanhoLados2;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Quadrado [tamanhoLados1=" + tamanhoLados1 + ", tamanhoLados2=" + tamanhoLados2 + ", cor=" + cor + "]";
	}
	
	
	
	

}
