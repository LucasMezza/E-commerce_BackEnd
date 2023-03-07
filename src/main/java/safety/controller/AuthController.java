package safety.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Mensaje;
import models.UserModel;
import safety.dto.LoginUser;
import safety.dto.NewUser;
import safety.enums.RolNombre;
import safety.model.Rol;
import safety.services.UserSecurityService;
import safety.services.RolService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	 @Autowired
	    PasswordEncoder passwordEncoder;

	    @Autowired
	    AuthenticationManager authenticationManager;

	    @Autowired
	    UserSecurityService userService;

	    @Autowired
	    RolService rolService;
	    
	    @PostMapping("/nuevo")
	    public ResponseEntity<?> nuevo(@Validated @RequestBody NewUser newUser, BindingResult bindingResult){
	        if(userService.existeByEmail(newUser.getEmail()))
	            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
	        UserModel user =
	                new UserModel(newUser.getEmail(), passwordEncoder.encode(newUser.getPassword()), newUser.getNombre(), newUser.getApellido(), newUser.getCiudad(), newUser.getDireccion());
	        Set<Rol> roles = new HashSet<>();
	        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
	        if(newUser.getRoles().contains("admin"))
	            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
	        user.setRoles(roles);
	        userService.save(user);
	        return new ResponseEntity(new Mensaje("usuario guardado"), HttpStatus.CREATED);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<?> delete(@PathVariable("id")Long id){
	    	if(!userService.existsById(id))
	    		 return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
	    	userService.delete(id);
			return new ResponseEntity(new Mensaje("usuario eliminado"), HttpStatus.OK);
	    	
	    }

	    @PostMapping("/login")
	    public ResponseEntity<?> login( @RequestBody LoginUser loginUsuario, BindingResult bindingResult){
	        if(bindingResult.hasErrors())
	            return new ResponseEntity(new Mensaje("campos mal puestos"), HttpStatus.BAD_REQUEST);
	        Authentication authentication =
	                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombre(), loginUsuario.getPassword()));
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
	        return new ResponseEntity(new Mensaje("usuario logeado"),HttpStatus.OK);
	    }
}
