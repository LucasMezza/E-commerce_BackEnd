package safety.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import models.UserModel;
import safety.repository.UserSecurityRepository;

@Service
@Transactional
public class UserSecurityService {

	@Autowired
	UserSecurityRepository usuarioRepository;
	
	public Optional<UserModel> getByNombre(String nombre) {
		return usuarioRepository.findByNombre(nombre);
	}
	
	public boolean existsByNombre(String nombre) {
		return usuarioRepository.existsByNombre(nombre);
	}
	
	public void save(UserModel person) {
		usuarioRepository.save(person);
	}
	
	public void delete(Long id){
	    usuarioRepository.deleteById(id);
	}

	public boolean existsById(Long id){
	    return usuarioRepository.existsById(id);
	}

	public boolean existeByEmail(String email) {
		return usuarioRepository.existsByNombre(email);
	}

}
