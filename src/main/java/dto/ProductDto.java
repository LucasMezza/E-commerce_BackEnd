package dto;

public class ProductDto {

	private int id;
	private String modelo;
	private String imagen;
	private float precioVenta;
	private float precioCosto;
	private int stock;
	private int idEmpleado;
	private int NumeroCompra;
	
	public ProductDto(String modelo, String imagen, float precioVenta, float precioCosto, int stock, int idEmpleado, int numeroCompra) {
		super();
		this.modelo = modelo;
		this.imagen = imagen;
		this.precioVenta = precioVenta;
		this.precioCosto = precioCosto;
		this.stock = stock;
		this.idEmpleado = idEmpleado;
		this.NumeroCompra = numeroCompra;
	}
	
	public ProductDto() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public float getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(float precioCosto) {
		this.precioCosto = precioCosto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public long getNumeroCompra() {
		return NumeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		NumeroCompra = numeroCompra;
	}
	
	
}
