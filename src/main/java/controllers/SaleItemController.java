package controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.SaleItemModel;
import services.SaleItemService;

@RestController
@RequestMapping("/item_venta")
public class SaleItemController {

	@Autowired
	SaleItemService saleItemService;
	
	@GetMapping("/lista")
	public ArrayList<SaleItemModel> obtenerVentas(){
		return saleItemService.obtenerItems();
	}
	
	@PostMapping("/crear")
	public SaleItemModel guardarVenta(@RequestBody SaleItemModel sale) {
		return this.saleItemService.guardarItems(sale);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<SaleItemModel> obtenerPorId(@PathVariable("id") Long id){
		return this.saleItemService.obtenerPorId(id);
	}
}
