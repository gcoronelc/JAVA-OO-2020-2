package pe.wilsonstore.ventaapp.prueba;

import java.util.List;
import pe.wilsonstore.ventaapp.dto.ProductoDto;
import pe.wilsonstore.ventaapp.service.VentaService;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		List<ProductoDto> lista;
		String categoria;
		// Proceso
		VentaService service = new VentaService();
		categoria = service.getCategorias()[1];
		lista = service.getProductos(categoria);
		// Reporte
		for (ProductoDto dto : lista) {
			System.out.println(dto.getProducto() + " - " + dto.getPrecio());
		}
	}
}
