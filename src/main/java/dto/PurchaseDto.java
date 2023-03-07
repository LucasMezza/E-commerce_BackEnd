package dto;

import java.util.Date;

public class PurchaseDto {

private int id;
	
	private int cantidad;
	private int precioTotal;
	private Date fecha;
	private String idEmpleado;
	
	public PurchaseDto(int cantidad, int precioTotal, Date fecha, String idEmpleado) {
		super();
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
		this.fecha = fecha;
		this.idEmpleado = idEmpleado;
	}
	
	public PurchaseDto() {
		super();
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
