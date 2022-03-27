package n1exercici2;

public class ClasseFill2 extends ClassePare{
	
	
	public ClasseFill2(String nom, String cognom1, String cognom2, int edat) {
		super(nom, cognom1, cognom2, edat);

	}

	@Deprecated
	public void mostrarDada() {
		
		System.out.println("El Segon Cognom de la ClasseFill2: " + cognom2);
	}

}
