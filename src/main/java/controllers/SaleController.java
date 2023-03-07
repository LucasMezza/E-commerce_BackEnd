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

import models.SaleModel;
import services.SaleService;

@RestController
@RequestMapping("/venta")
public class SaleController {

	@Autowired
	SaleService saleService;
	
	@GetMapping("/lista")
	public ArrayList<SaleModel> obtenerVentas(){
		return saleService.obtenerVentas();
	}
	
	@PostMapping("/crear")
	public SaleModel guardarVenta(@RequestBody SaleModel sale) {
		return this.saleService.guardarVenta(sale);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<SaleModel> obtenerPorId(@PathVariable("id") Long id){
		return this.saleService.obtenerPorId(id);
	}
}
