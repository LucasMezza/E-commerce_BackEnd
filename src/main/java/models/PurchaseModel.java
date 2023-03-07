package models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="compra")
public class PurchaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="numero_compra", nullable = false, unique = true)
	private int id;
	
	@Column(name="cantidad", nullable = false)
	private int cantidad;
	
	@Column(name="precio_total", nullable = false)
	private int precioTotal;
	
	@Column(name="fecha", nullable = false)
	private Date fecha;
	
	@Column(name="id_empleado", length = 50, nullable = false)
	private String idEmpleado;
	
	public PurchaseModel(int cantidad, int precioTotal, Date fecha, String idEmpleado) {
		super();
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
		this.fecha = fecha;
		this.idEmpleado = idEmpleado;
	}

	public long getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

}
