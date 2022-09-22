import java.io.File;
public class Act1_1_3 {

	public static void main(String[] args) {
		
		File ruta = new File("C:\\Users\\Jordi\\Desktop\\DAM\\M6\\UF1\\Act1.1\\src\\Act1_1_3.java");
		
		String nomFitxer = ruta.getName();
		
		System.out.println(nomFitxer);
		
		String rutaPath = ruta.getPath();
		
		System.out.println(rutaPath);
		
		String rutaAbsoluta = ruta.getAbsolutePath();
		
		System.out.println(rutaAbsoluta);
		
		if(ruta.canWrite()) {
			System.out.println("Es pot escriure");
		}else {
			System.out.println("No es pot escriure");
		}
		
		if(ruta.canRead()) {
			System.out.println("Es pot llegit");
			
		}else {
			System.out.println("No es pot llegir");
			
		}
		
		long bytes = ruta.length();
		
		System.out.println(String.format("%,d bytes", bytes));
		
		if(ruta.isDirectory()) {
			System.out.println("Es un directori");
			
		}else if(ruta.isFile()) {
			System.out.println("Es un fitxer");
			
		}	
	}
}
