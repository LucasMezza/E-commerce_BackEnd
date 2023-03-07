package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.ProductModel;
import repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public ArrayList<ProductModel> obtenerProductos(){
		return (ArrayList<ProductModel>)productRepository.findAll();
	}
	
	public ProductModel guardarProducto(ProductModel product) {
		return productRepository.save(product);
	}
	
	public Optional<ProductModel> obtenerPorId(Long id){
		return productRepository.findById(id);
	}
	
	public boolean eliminarProducto(Long id) {
		try {
			productRepository.deleteById(id);
			return true;
		}
		catch(Exception err){
			return false;
		}
	}
}
