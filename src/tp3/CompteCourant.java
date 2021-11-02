package tp3;

public class CompteCourant extends Compte {

	public CompteCourant(Client c, double montant) {
		super(c, montant);
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

	@Override
	
	
	
	public String toString() {
		return "CC [numcompte=" + numcompte + ", Montant()=" + getMontant() +","
				+ super.toString() + "]";
	}
}