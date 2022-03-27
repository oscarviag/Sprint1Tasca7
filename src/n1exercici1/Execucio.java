package n1exercici1;

public class Execucio {

	public static void main(String[] args) {
		
		ClassePare pare = new ClassePare("Nom Pare","Cognom1 Pare", "Cognom2 Pare",45);
		ClasseFill1 fill1 = new ClasseFill1("Nom Fill1","Cognom1 Fill1", "Cognom2 Fill1",23);
		ClasseFill2 fill2 = new ClasseFill2("Nom Fill2","Cognom1 Fill2", "Cognom2 Fill2",21);

		pare.mostrarDada();
		fill1.mostrarDada();
		fill2.mostrarDada();
	}

}
