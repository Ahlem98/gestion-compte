package tp3;

public class Operation {
	private String date ;
	private String type ;
	private double montant ;
	
	public Operation(String date,double montant,String type ) {
		this.date=date;
		this.type=type;
		this.montant=montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [date=" + date + ", type=" + type + ", montant=" + montant + "]";
	}
	

	
	}
