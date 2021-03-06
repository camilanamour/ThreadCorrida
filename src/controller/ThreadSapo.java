package controller;

public class ThreadSapo extends Thread{
	
	private int sapo;
	private int posicao;
	private int maximopulo; 		//tamanho maximo para cada pulo
	private int minimopulo;  		//tamanho minimo do pulo
	private int totalpulo;			//total de pulos
	private int maximadistancia; 	//distância da corrida
	
	//Método Construtor
	public ThreadSapo(int numero){
		this.sapo = numero;
		this.posicao = 0;
		this.maximopulo = 20;
		this.minimopulo = 5;
		this.totalpulo = 0;
		this.maximadistancia = 100;		
	}
	
	@Override
	public void run() {
		int classificado = 0;
		int tempo = this.sapo * 1000;
		InicioCorrida(classificado, tempo);
				
	}
	
	private void InicioCorrida(int classificado, int tempo){
//		StringBuffer buffer = new StringBuffer();
		do{
			int salto = (int) ((Math.random() * 16 ) + 5);
			this.totalpulo += salto;
			System.out.println("O sapo " + this.sapo + "\tTamanho do pulo: " + salto + "m \tDistância percorrida: "
								+ (this.totalpulo) + "m");
		} while(this.totalpulo < this.maximadistancia );
		
//		try {
//			sleep(tempo);
//			this.posicao = classificado++;
//			buffer.append("Sapo ");
//			buffer.append(this.sapo);
//			buffer.append(" - ");
//			buffer.append(this.posicao);
//			buffer.append("º lugar");
//			
//			if(classificado == 1){
//				System.out.println(buffer);
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}			
}

