package dto;

public class SelectionDto {

private int id_producto;
	
	private long id_venta;
	private int cantidad;
	private int precio;
	
	public SelectionDto(int cantidad, int precio) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public SelectionDto() {
		super();
	}

	public long getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public long getId_venta() {
		return id_venta;
	}

	public void setId_venta(long id_venta) {
		this.id_venta = id_venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
