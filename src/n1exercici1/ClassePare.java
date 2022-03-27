package n1exercici1;

public class ClassePare {
	
	protected String nom;
	protected String cognom1;
	protected String cognom2;
	protected int edat;
	
	
	public ClassePare(String nom, String cognom1, String cognom2, int edat) {
		super();
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.edat = edat;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getCognom1() {
		return cognom1;
	}



	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}



	public String getCognom2() {
		return cognom2;
	}



	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}



	public int getEdat() {
		return edat;
	}



	public void setEdat(int edat) {
		this.edat = edat;
	}



	public void mostrarDada() {
		
		System.out.println("Mostro el Nom de la ClassePare: " + nom);
	}
	
	public void mostrarEdat(){
		
		System.out.println("Tens: " + edat + "anys");
		
	}
	
	

}
