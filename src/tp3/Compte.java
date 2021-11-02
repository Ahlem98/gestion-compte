package tp3;

import java.util.ArrayList;



public class Compte {
	 private Client clt;
	 static int n=1;
	 final int numcompte;
	 private double montant;
	 private int num;
	 private ArrayList<Operation> oplist=new ArrayList<Operation>();
	 public Compte(Client clt,double montant) {
		 this.clt=clt;
		 this.montant=montant;
		 this.numcompte=n;
		 n++;
		 
	 }
	 
	 public void depot(String dateop,double montant,String libelle) {
		 
		 Operation op = new Operation(dateop, montant, libelle);
		 this.oplist.add(op);
		 this.montant=this.montant+montant;
		 System.out.println(toString());
	 }
	 
	 public void retrait(String dateop,double montant,String libelle) {
		 montant=montant*(-1);
		 Operation op = new Operation(dateop, montant, libelle);
		 this.oplist.add(op);
		 this.montant=this.montant+montant;
		 System.out.println(toString());
	 }

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Compte ["+ clt + ", montant=" + montant + ",oplist=" + oplist + "]";}
	
		public void historque(int num) {
			for (int i=oplist.size();i>=num;i--) {
				System.out.println(oplist.get(i));
			}
			
				
			}

}