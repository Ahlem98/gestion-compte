package tp3;

public class Client {
	private String nom=new String();
	private String date=new String();
	
	public Client(String nom,String date) {
		this.nom=nom;
		this.date=date;
	}
	
	public Client() {}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", date=" + date + "]";
	}
	
	

}