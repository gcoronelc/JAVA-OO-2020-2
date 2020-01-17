package pe.wilsonstore.ventaapp.controller;

import java.util.List;
import pe.wilsonstore.ventaapp.dto.ProductoDto;
import pe.wilsonstore.ventaapp.dto.VentaDto;
import pe.wilsonstore.ventaapp.service.VentaService;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class VentaController {

	private VentaService ventaService;

	public VentaController() {
		ventaService = new VentaService();
	}
	
	public String[] traerCategorias() {
		return ventaService.getCategorias();
	}

	public List<ProductoDto> traerProductos(String categoria) {
		return ventaService.getProductos(categoria);
	}

	public void procesarVenta(VentaDto ventaDto) {
		ventaService.grabarVenta(ventaDto);
	}

	
	
	
}
