package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;



import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import safety.model.Rol;

@Entity
@Table(name="usuario")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(nullable = false, unique = true)
	private int id;
	
	@Column(name="email", length = 40, nullable = false)
	private String email;
	
	@Column(name="nombre", length = 30, nullable = false)
	private String nombre;
	
	@Column(name="apellido", length = 30, nullable = false)
	private String apellido;
	
	@Column(name="ciudad", length = 50, nullable = false)
	private String ciudad;
	
	@Column(name="direccion", length = 50, nullable = false)
	private String direccion;
	
	@Column(name="password", length = 50, nullable = false)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();
	
	public UserModel(String email, String password, String nombre, String apellido, String ciudad, String direccion) {
		super();
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Rol> getRoles() {
		return roles;
	}
	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

}
