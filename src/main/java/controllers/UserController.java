package controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.UserModel;
import services.UserService;

@RestController
@RequestMapping("/usuario")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/lista")
	public ArrayList<UserModel> obtenerUsuarios(){
		return userService.obtenerUsuarios();
	}
	
	@PostMapping("/crear-actualizar")
	public UserModel guardarUsuario(@RequestBody UserModel user) {
		return this.userService.guardarUsuario(user);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UserModel> obtenerPorId(@PathVariable("id") Long id){
		return this.userService.obtenerPorId(id);
	}
	
	@DeleteMapping(path = "eliminar/{id}")
	public String eliminarPorId(@PathVariable("id") Long id){
		boolean ok = this.userService.eliminarUsuario(id);
		if(ok) {
			return "Se eliminó el usuario con el id" + id;
		}
		else {
			return "No se pudo eliminar el usuario con el id" + id;
		}
	}
}
