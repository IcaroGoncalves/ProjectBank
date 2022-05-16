package entities;

public class ContaEstudantil extends Conta {

	private double taxa = 0.0;
	 
		public ContaEstudantil(String nome, int num_conta) {
		super(nome, num_conta);
		
	}
		
			public void descontar_taxa() {
			    super.saldo = this.saldo - taxa;
			}
			
	       }


