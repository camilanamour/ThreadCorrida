package controller;

public class ThreadSapo extends Thread{
	
	private int sapo;
	static int posicao = 0;
	private int maximopulo; 		//tamanho maximo para cada pulo
	private int minimopulo;  		//tamanho minimo do pulo
	private int totalpulo;			//total de pulos
	private int maximadistancia; 	//distância da corrida
	
	//Método Construtor
	public ThreadSapo(int numero){
		this.sapo = numero;
		this.maximopulo = 20;
		this.minimopulo = 5;
		this.totalpulo = 0;
		this.maximadistancia = 100;		
	}
	
	@Override
	public void run() {
		InicioCorrida();
				
	}
	
	private void InicioCorrida(){
		String classificado[] = new String [5];
		StringBuffer buffer = new StringBuffer();
		while(this.totalpulo < this.maximadistancia ){
			int salto = (int) ((Math.random() * 16 ) + 5);
			this.totalpulo += salto;
			System.out.println("O sapo " + this.sapo + "\tTamanho do pulo: " + salto + "m \tDistância percorrida: "
								+ (this.totalpulo) + "m");
		}
		posicao++;
		System.out.println("\n================== Sapo " + this.sapo + " chegou em " + posicao + "º lugar ==================\n");
		
		
	}			
}

