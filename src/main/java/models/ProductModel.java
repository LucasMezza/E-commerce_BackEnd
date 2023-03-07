package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class ProductModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_producto", nullable = false, unique = true)
	private int id;

	@Column(name="modelo", length = 50, nullable = false)
	private String modelo;
	
	@Column(name="imagen", length = 50, nullable = false)
	private String imagen;
	
	@Column(name="precio_venta", length = 50, nullable = false)
	private float precioVenta;
	
	@Column(name="precio_costo", length = 50, nullable = false)
	private float precioCosto;
	
	@Column(name="stock", length = 50, nullable = false)
	private int stock;
	
	@Column(name="id_empleado", length = 50, nullable = false)
	private int idEmpleado;
	
	@Column(name="Numero_compra", length = 50, nullable = false)
	private int NumeroCompra;
	
	public ProductModel(String modelo, String imagen, float precioVenta, float precioCosto, int stock, int idEmpleado, int numeroCompra) {
		super();
		this.modelo = modelo;
		this.imagen = imagen;
		this.precioVenta = precioVenta;
		this.precioCosto = precioCosto;
		this.stock = stock;
		this.idEmpleado = idEmpleado;
		this.NumeroCompra = numeroCompra;
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
