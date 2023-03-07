package dto;

public class UserDto {

	private int id;
	private String email;
	private String nombre;
	private String apellido;
	private String ciudad;
	private String direccion;
	private String password;
	
	public UserDto(String email, String nombre, String apellido, String ciudad, String direccion, String password) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.password = password;
	}
	
	public UserDto() {
		super();

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

}
