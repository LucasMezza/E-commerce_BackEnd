package safety.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import models.UserModel;


public interface UserSecurityRepository extends JpaRepository<UserModel , Long>{
	Optional<UserModel> findByNombre(String nombre);
	boolean existsByNombre(String nombre);
}
