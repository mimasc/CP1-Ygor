
package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

// classe principal que executa o projeto
public class SistemaPrincipal {

	public static void main(String[] args) {
		// criando um objeto da classe Veiculos
		Veiculos v1 = new Veiculos();
		// definições
			v1.setIndividuo("Carlos");
			v1.setPlaca("ABC-1234");
			v1.setGasolina(10);
			
			v1.adicionarGasolina(50);
			v1.gastaGasolina(100);

		// printando as informações
			System.out.println("Dono: Carlos | Placa: " + v1.getPlaca() + "| Gasolina: " + v1.getGasolina());

	}

}
