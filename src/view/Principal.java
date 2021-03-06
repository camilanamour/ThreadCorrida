package view;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("======================= CORRIDA DE SAPOS =======================");	
		System.out.println("== COMEÇOU =====================================================\n");
		for(int numero=0; numero<5; numero++){
			Thread sapo = new ThreadSapo(numero);
			sapo.start();
		}

	}

}
