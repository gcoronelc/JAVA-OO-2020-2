package pe.wilsonstore.ventaapp.dto;

/**
 *
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class ProductoDto {

	private String categoria;
	private String producto;
	private double precio;
	private int stock;

	// Constructor por defecto
	public ProductoDto() {
	}

	// Constroctor adicional
	public ProductoDto(String categoria, String producto, double precio, int stock) {
		this.categoria = categoria;
		this.producto = producto;
		this.precio = precio;
		this.stock = stock;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return producto;
	}

}
