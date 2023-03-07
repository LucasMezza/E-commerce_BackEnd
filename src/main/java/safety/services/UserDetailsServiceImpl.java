package safety.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import safety.model.PrincipalUser;
import safety.services.UserSecurityService;
import models.UserModel;

@Service
public class UserDetailsServiceImpl {

	@Autowired
	UserSecurityService usuarioService;
	 
	public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
		   UserModel person = usuarioService.getByNombre(nombre).get();
	       return (UserDetails) PrincipalUser.build(person);
	}
}
