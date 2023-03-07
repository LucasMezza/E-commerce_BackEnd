package safety.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import safety.enums.RolNombre;
import safety.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
