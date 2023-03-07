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

import models.PurchaseModel;
import services.PurchaseService;

@RestController
@RequestMapping("/compra")
public class PurchaseController {

	@Autowired
	PurchaseService purchaseService;
	
	@GetMapping("/lista")
	public ArrayList<PurchaseModel> obtenerCompras(){
		return purchaseService.obtenerCompras();
	}
	
	@PostMapping("/crear")
	public PurchaseModel guardarCompra(@RequestBody PurchaseModel purchase) {
		return this.purchaseService.guardarCompra(purchase);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<PurchaseModel> obtenerPorId(@PathVariable("id") Long id){
		return this.purchaseService.obtenerPorId(id);
	}
}
