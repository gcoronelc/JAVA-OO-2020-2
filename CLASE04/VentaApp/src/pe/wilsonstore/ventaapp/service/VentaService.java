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
		dto.setImporte(importe);
		Data.VENTAS.add(dto);
	}

	public List<VentaDto> getVentas(String categoria){
		// Control
		if( categoria.equals("TODOS")){
			return Data.VENTAS;
		}
		// Variables
		List<VentaDto> ventas = null;
		// Proceso
		ventas = new ArrayList<>();
		for(VentaDto dto: Data.VENTAS){
			if( dto.getCategoria().equals(categoria)){
				ventas.add(dto);
			}
		}
		// Reporte
		return ventas;
	}
	
	public List<VentaDto> getResumen1(String categoria){
		// Variables
		List<VentaDto> resumen = new ArrayList<>();
		// Datos
		List<ProductoDto> listaProd = getProductos(categoria);
		for (ProductoDto dto : listaProd) {
			VentaDto venta = new VentaDto("", dto.getProducto(), dto.getPrecio(), 0, 0);
			resumen.add(venta);
		}
		// Proceso
		for(VentaDto venta: Data.VENTAS){
			if(!categoria.equals(venta.getCategoria())){
				continue;
			}
			for(VentaDto vtaResumen: resumen){
				if(vtaResumen.getProducto().equals(venta.getProducto())){
					vtaResumen.setCantidad(vtaResumen.getCantidad() + venta.getCantidad());
					vtaResumen.setImporte(vtaResumen.getImporte()+ venta.getImporte());					
					break;
				}
			}
		}
		// Reporte
		return resumen;
	}
}
