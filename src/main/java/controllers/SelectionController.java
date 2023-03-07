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

import models.SelectionModel;
import services.SelectionService;

@RestController
@RequestMapping("/seleccion")
public class SelectionController {

	@Autowired
	SelectionService selectionService;
	
	@GetMapping("/lista")
	public ArrayList<SelectionModel> obtenerVentas(){
		return selectionService.obtenerSeleccionados();
	}
	
	@PostMapping("/crear")
	public SelectionModel guardarVenta(@RequestBody SelectionModel selected) {
		return this.selectionService.guardarVenta(selected);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<SelectionModel> obtenerPorId(@PathVariable("id") Long id){
		return this.selectionService.obtenerPorId(id);
	}
}
