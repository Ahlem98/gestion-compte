package tp3;

import tp3.Client;
import tp3.Compte;
import tp3.CompteCourant;
import tp3.CompteEpargne;

public class main {

	public static void main(String[] args ) {
		Client clt=new Client("ahlem","20/20/20");
		Compte cmp=new Compte(clt,20f);
		CompteCourant cmptcr=new CompteCourant(clt, 0);
		CompteEpargne cmptep=new CompteEpargne(clt,20);
		System.out.println(cmptcr);
		try {
		cmptcr.retrait(5.00);
		cmptep.retrait(5.00);
		System.out.println(cmp);}
		catch(EMontantMinException e) {e.getCause();}
		
			
		}
		// TODO Auto-generated method stub

	}
