package models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="venta")
public class SaleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="numero_venta", nullable = false, unique = true)
	private int id;
	
	@Column(name="precio_total" , nullable = false)
	private int precioTotal;
	
	@Column(name="fecha", nullable = false)
	private Date fecha;
	
	@Column(name="id_empleado", length = 50, nullable = false)
	private String idEmpleado;
	
	@Column(name="id_usuario", length = 50, nullable = false)
	private String idUsuario;
	
	public SaleModel(int cantidad, int precioTotal, Date fecha, String idEmpleado, String idUsuario) {
		super();
		this.precioTotal = precioTotal;
		this.fecha = fecha;
		this.idEmpleado = idEmpleado;
		this.idUsuario = idUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
}
