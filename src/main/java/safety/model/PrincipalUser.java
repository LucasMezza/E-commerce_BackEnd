package safety.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import models.UserModel;
import safety.model.PrincipalUser;



public class PrincipalUser implements UserDetails{

	private static final long serialVersionUID = 1L;
	private String nombre;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public PrincipalUser(String nombre, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.password = password;
        this.authorities = authorities;
    }

    public static PrincipalUser build(UserModel user){
        List<GrantedAuthority> authorities =
                user.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol
                .getRolNombre().name())).collect(Collectors.toList());
        return new PrincipalUser(user.getNombre(), user.getPassword(), authorities);
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
}
