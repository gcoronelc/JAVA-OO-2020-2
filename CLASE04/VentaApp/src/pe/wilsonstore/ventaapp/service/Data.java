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
class Data {

	// Para que no se pueda instanciar
	private Data() {
	}

	// Categorias
	static final String CAT01 = "DISCOS DUROS";
	static final String CAT02 = "LAPTOPS";
	static final String CAT03 = "IMPRESORAS";
	
	// Variables
	static final List<ProductoDto> PRODUCTOS;
	static final List<VentaDto> VENTAS;
	
	// Inicializar variables
	static {
		// Variables
		PRODUCTOS = new ArrayList<>();
		VENTAS = new ArrayList<>();
		// Productos de CAT01
		PRODUCTOS.add(new ProductoDto(CAT01, "Disco Solido", 2000.0, 1000));
		PRODUCTOS.add(new ProductoDto(CAT01, "Disco Externo", 1000.0, 1000));
		PRODUCTOS.add(new ProductoDto(CAT01, "Disco Estandar", 700.0, 1000));
		// Productos de CAT02
		PRODUCTOS.add(new ProductoDto(CAT02, "Laptop I10", 10000.0, 1000));
		PRODUCTOS.add(new ProductoDto(CAT02, "Laptop ASUS", 15000.0, 1000));
		PRODUCTOS.add(new ProductoDto(CAT02, "LAPTOP Desarrollo", 20000.0, 1000));
		// Productos de CAT03
		PRODUCTOS.add(new ProductoDto(CAT03, "Impresora 3D", 10000.0, 1000));
		PRODUCTOS.add(new ProductoDto(CAT03, "Lmpresora Matricial", 15000.0, 1000));
		PRODUCTOS.add(new ProductoDto(CAT03, "Ompresora Laser", 20000.0, 1000));
	}
	
}
