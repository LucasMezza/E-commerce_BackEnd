package repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{

	Optional<UserModel> findByEmail(String email);
	boolean existeByEmail(String email);
}
