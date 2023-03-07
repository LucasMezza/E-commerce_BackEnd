package dto;

public class SaleItemDto {
	
private int id;
	
	private int numeroVenta;
	
	public SaleItemDto(int numeroVenta) {
		super();
		this.numeroVenta = numeroVenta;
	}
	
	public SaleItemDto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}
	
}
