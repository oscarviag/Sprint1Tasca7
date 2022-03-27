package n1exercici1;

public class ClasseFill1 extends ClassePare{

	public ClasseFill1(String nom, String cognom1, String cognom2, int edat) {
		super(nom, cognom1, cognom2, edat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDada() {
		
		System.out.println("El Primer Cognom de la ClasseFill1: " + cognom1);
	}

}
