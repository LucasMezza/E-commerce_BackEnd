package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.PurchaseModel;

@Repository
public interface PurchaseRepository extends CrudRepository<PurchaseModel, Long>{
	
}