package dto;

import java.util.Date;

public class SaleDto {

private int id;
	
	private int precioTotal;
	private Date fecha;
	private String idEmpleado;
	private String idUsuario;
	
	public SaleDto(int cantidad, int precioTotal, Date fecha, String idEmpleado, String idUsuario) {
		super();
		this.precioTotal = precioTotal;
		this.fecha = fecha;
		this.idEmpleado = idEmpleado;
		this.idUsuario = idUsuario;
	}
	
	public SaleDto() {
		super();
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
