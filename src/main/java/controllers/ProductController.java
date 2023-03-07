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

import models.ProductModel;
import services.ProductService;

@RestController
@RequestMapping("/producto")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/lista")
	public ArrayList<ProductModel> obtenerProductos(){
		return productService.obtenerProductos();
	}
	
	@PostMapping("/crear-actualizar")
	public ProductModel guardarProducto(@RequestBody ProductModel product) {
		return this.productService.guardarProducto(product);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<ProductModel> obtenerPorId(@PathVariable("id") Long id){
		return this.productService.obtenerPorId(id);
	}
	
	@DeleteMapping(path = "eliminar/{id}")
	public String eliminarPorId(@PathVariable("id") Long id){
		boolean ok = this.productService.eliminarProducto(id);
		if(ok) {
			return "Se eliminó el producto con el id" + id;
		}
		else {
			return "No se pudo eliminar el producto con el id" + id;
		}
	}

}
