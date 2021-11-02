package tp3;


public class CompteEpargne extends Compte {
	private int depotmin=200;
	
	public CompteEpargne(Client clt, double montant) {
		super(clt, montant);
	}
	public void retrait(double n) throws EMontantMinException 
	{
		System.out.println();
		if (super.getMontant()>=n) {
			super.setMontant(super.getMontant()-n);
				
		}
		else
			throw new EMontantMinException("solde insuff");
	}
	public void calculIntert() {
		double frais =this.getMontant()*0.1;
		this.setMontant(this.getMontant()*0.9);
		System.out.println("les frais="+frais+"nouveau solde est"+this.getMontant());
	}
	
	
	

	@Override
	public String toString() {
		return "CE [" + numcompte + ", getMontant()="
				+ getMontant() + ", toString()=" + super.toString() + "]";
	}
}
