package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long>{

}
