package n2exercici1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import com.google.gson.*;

public class Exercici {

	public static void main(String[] args) {
		
		serialitzatJSON();

	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface RutaDesti {
	    public String directoriDesti() default "C:\\Users\\kart_\\Desktop\\Prova";
	}
	
	public static void serialitzatJSON(){
			
		Integer enviar = 4;
		Gson gson = new Gson();
		String enviarJSON = gson.toJson(enviar);
			
		String ruta ="C:\\Users\\kart_\\Desktop\\Prova";
		EscriureArxiu(ruta, "serialitzat.json", enviarJSON);
		
	}
	
	public static void CrearArxiu(String ruta, String nomArxiu) {
		
		File arxiu = new File(ruta + File.separator + nomArxiu);
		
		try {
			
			arxiu.createNewFile();
			System.out.println("Arxiu creat");
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void EscriureArxiu(String ruta, String nomArxiu, String dades) {
		
		CrearArxiu(ruta, nomArxiu);
		BufferedWriter bufferedWriter = null;
		FileWriter escriptura=null;
		
		try {
			
			escriptura = new FileWriter(ruta + File.separator + nomArxiu); 
			bufferedWriter = new BufferedWriter(escriptura);	
			bufferedWriter.write(dades);
			bufferedWriter.close();
			escriptura.close();
			System.out.println("Arxiu guardat amb les dades");
			
		} catch (IOException e) {
			
			System.out.println("Arxiu no disponible");
			e.printStackTrace();
		}
				
	}

}



