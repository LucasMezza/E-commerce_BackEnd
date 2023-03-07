package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.UserModel;
import repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public ArrayList<UserModel> obtenerUsuarios(){
		return (ArrayList<UserModel>)userRepository.findAll();
	}
	
	public UserModel guardarUsuario(UserModel user) {
		return userRepository.save(user);
	}
	
	public Optional<UserModel> obtenerPorId(Long id){
		return userRepository.findById(id);
	}
	
	public Optional<UserModel> getByEmail(String email){
        return userRepository.findByEmail(email);
    }
	
	public boolean eliminarUsuario(Long id) {
		try {
			userRepository.deleteById(id);
			return true;
		}
		catch(Exception err){
			return false;
		}
	}
}
