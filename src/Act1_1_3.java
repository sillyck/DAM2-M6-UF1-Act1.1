import java.io.File;

public class Act1_1_3 {

	public static void main(String[] args) {
		
		try {
			
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
			
			
			
			
		}catch (Exception e){
			System.err.println("No s'ha trobat l'arxiu.  " + e.getMessage());
		}
		
	}

}
