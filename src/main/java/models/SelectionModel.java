package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="seleccion")
public class SelectionModel {

	@Id 
	@Column(name="id_producto", nullable = false, unique = true)
	private int id_producto;
	
	@Id
	@Column(name="id_venta" , unique = true, nullable = false)
	private long id_venta;
	
	@Column(name="cantidad", nullable = false)
	private int cantidad;
	
	@Column(name="precio", nullable = false)
	private int precio;
	
	public SelectionModel(int cantidad, int precio) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
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
