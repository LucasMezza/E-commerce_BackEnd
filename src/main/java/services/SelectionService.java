package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.SelectionModel;
import repositories.SelectionRepository;

@Service
public class SelectionService {

	@Autowired
	SelectionRepository selectionRepository;
	
	public ArrayList<SelectionModel> obtenerSeleccionados(){
		return (ArrayList<SelectionModel>)selectionRepository.findAll();
	}
	
	public SelectionModel guardarVenta(SelectionModel selected) {
		return selectionRepository.save(selected);
	}
	
	public Optional<SelectionModel> obtenerPorId(Long id){
		return selectionRepository.findById(id);
	}
}
