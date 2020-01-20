package pe.wilsonstore.ventaapp.prueba;

import pe.wilsonstore.ventaapp.service.VentaService;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		String[]  categorias;
		// Proceso
		VentaService service = new VentaService();
		categorias = service.getCategorias();
		// Reporte
		for (String categoria : categorias) {
			System.out.println(categoria);
		}
	}
	
}
