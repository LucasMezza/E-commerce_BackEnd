package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.SaleItemModel;

@Repository
public interface SaleItemRepository extends CrudRepository<SaleItemModel, Long>{

}
