package entities;

public class ContaCorrente extends Conta{
	 
	
	private double taxa = 0.03;
	 
	 
	 
	public ContaCorrente(String nome, int num_conta) {
		super(nome, num_conta);
		
	}


	
		public void descontar_taxa() {
		    super.saldo = this.saldo - taxa;
		}
		
       }


      

