
package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Veiculos v1 = new Veiculos();
			v1.setIndividuo("Carlos");
			v1.setPlaca("ABC-1234");
			v1.setGasolina(10);
			
			v1.adicionarGasolina(50);
			v1.gastaGasolina(100);
			
			System.out.println("Dono: Carlos | Placa: " + v1.getPlaca() + "| Gasolina: " + v1.getGasolina());

	}

}
