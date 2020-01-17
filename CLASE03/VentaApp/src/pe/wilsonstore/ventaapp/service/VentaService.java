package pe.wilsonstore.ventaapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.wilsonstore.ventaapp.dto.ProductoDto;
import pe.wilsonstore.ventaapp.dto.VentaDto;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class VentaService {

	public String[] getCategorias() {
		// Variables
		String[] categorias;
		// Proceso
		categorias = new String[]{Data.CAT01, Data.CAT02, Data.CAT03};
		// Reporte
		return categorias;
	}

	public List<ProductoDto> getProductos( String categoria){
		// Variables
		List<ProductoDto> lista = new ArrayList<>();
		// Proceso
		for(ProductoDto dto: Data.PRODUCTOS){
			if(dto.getCategoria().equals(categoria)){
				lista.add(dto);
			}
		}
		// Reporte
		return lista;
	}
	
	public void grabarVenta(VentaDto dto){
		// Variables
		double importe;
		// Proceso
		importe = dto.getPrecio() * dto.getCantidad();
		Data.VENTAS.add(dto);
	}

}
