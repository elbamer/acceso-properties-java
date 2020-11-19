package spring;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInteresado {

	public static void main(String arg[]) {

		PropertiesInteresado miArchivo = new PropertiesInteresado();
		miArchivo.leerArchivo();
	}

	/**
	 * Lee un archivo de propiedades desde una ruta especifica
	 * y se imprime en pantalla. 
	 */ 
	private void leerArchivo() {
		try { 

			/**Creamos un Objeto de tipo Properties*/
			Properties propiedades = new Properties();

			/**Cargamos el archivo desde la ruta especificada*/
			propiedades
			.load(new FileInputStream(

					"C:/Users/Elbam/AccesoProperties/src/aplication.properties"));
			               

			/**Obtenemos los parametros definidos en el archivo*/
			
			String usuario = propiedades.getProperty("usuario");
			String password = propiedades.getProperty("password");

			/**Imprimimos los valores*/
			System.out.println("name: "+usuario + "\n" +"Pagina: "+ password);


		} catch (FileNotFoundException e) {
			System.out.println("Error, El archivo no exite");
		} catch (IOException e) {
			System.out.println("Error, No se puede leer el archivo");
		}
	}}




