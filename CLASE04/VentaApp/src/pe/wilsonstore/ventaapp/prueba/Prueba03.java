package pe.wilsonstore.ventaapp.prueba;

import java.util.List;
import pe.wilsonstore.ventaapp.dto.ProductoDto;
import pe.wilsonstore.ventaapp.dto.VentaDto;
import pe.wilsonstore.ventaapp.service.VentaService;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Variables
		VentaService service = new VentaService();
		// Categorias
		String[] categorias = service.getCategorias();
		// Productos
		ProductoDto prod1 = service.getProductos(categorias[0]).get(0);
		ProductoDto prod2 = service.getProductos(categorias[0]).get(1);
		ProductoDto prod3 = service.getProductos(categorias[1]).get(0);
		ProductoDto prod4 = service.getProductos(categorias[2]).get(0);
		// Ventas
		VentaDto venta1 = new VentaDto(prod1.getCategoria(),prod1.getProducto(),
			prod1.getPrecio(), 5, 0);
		VentaDto venta2 = new VentaDto(prod2.getCategoria(),prod2.getProducto(),
			prod2.getPrecio(), 10, 0);
		VentaDto venta3 = new VentaDto(prod3.getCategoria(),prod3.getProducto(),
			prod3.getPrecio(), 15, 0);
		VentaDto venta4 = new VentaDto(prod4.getCategoria(),prod4.getProducto(),
			prod4.getPrecio(), 8, 0);
		// Cargar Ventas
		service.grabarVenta(venta1);
		service.grabarVenta(venta2);
		service.grabarVenta(venta3);
		service.grabarVenta(venta4);
		// Leer las ventas
		//List<VentaDto> ventas = service.getVentas("TODOS");
		List<VentaDto> ventas = service.getVentas(categorias[2]);
		for (VentaDto venta : ventas) {
			System.out.println(venta.getProducto() + " - " + venta.getImporte());
		}
		
	}
}
