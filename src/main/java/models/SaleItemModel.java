package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="item_venta")
public class SaleItemModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_venta", nullable = false, unique = true)
	private int id;
	
	@Column(name="numero_venta" , nullable = false)
	private int numeroVenta;
	
	public SaleItemModel(int numeroVenta) {
		super();
		this.numeroVenta = numeroVenta;
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
