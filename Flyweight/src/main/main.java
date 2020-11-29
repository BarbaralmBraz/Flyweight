package main;

import model.Quadrado;

import java.util.Random;

import fabricas.FabricaQuadrados;

public class main {

	
	public static void main(String[] args) {
		int[] tamanhos = {10, 20, 30, 40, 50};
		String[] cores = {"preto", "azul", "verde", "vermelho", "branco", "rosa"};
		String cor;
		Quadrado quadrado;
		FabricaQuadrados fabrica = new FabricaQuadrados();
		int tamanho1;
		int tamanho2;
		Random random = new Random();
		int indice;
		for(int i = 0; i<20; i++) {
			indice = random.nextInt(cores.length);
			cor = cores[indice];
			quadrado = fabrica.getQuadrado(cor);
			
			indice = random.nextInt(tamanhos.length);
			tamanho1 = tamanhos[indice];
			indice = random.nextInt(tamanhos.length);
			tamanho2 = tamanhos[indice];
			quadrado.setTamanhoLados1(tamanho1);
			quadrado.setTamanhoLados2(tamanho2);
			System.out.println(quadrado.toString());
			
			
		}
		

	}

}
