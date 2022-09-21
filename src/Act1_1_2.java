import java.io.File;
import java.util.Scanner;

public class Act1_1_2 {
	
	private static File ruta;
	
	public static void main(String[] args) {
		
		ruta();
		coprovarDirectori();
				
	}
	
	//En aquesta funció demanem la ruta com a string
	//I la canviem a tipus File la qual ho interpreta
	//Com un directori
	public static void ruta() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriu la ruta de la carpeta: ");
		
		String rutaProisional = entrada.next();
		
		ruta = new File(rutaProisional);
	}
	
	//Comprovem si el que hem entrat per parametre
	//Es un directori o no
	public static void coprovarDirectori() {
		if(ruta.isDirectory()) {
			mostrarContingut();
		}else {
			System.out.println("El que has introduit no es una ruta.");
		}
	}
	
	//Aqui mostrem el contingut de la carpeta indicada
	public static void mostrarContingut() {
		
		String[] contingut = ruta.list();
		
		for(String interior : contingut) {
			System.out.println(interior);
		}
		
	}

}

