package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.SaleItemModel;
import repositories.SaleItemRepository;

@Service
public class SaleItemService {
	
	@Autowired
	SaleItemRepository saleItemRepository;
	
	public ArrayList<SaleItemModel> obtenerItems(){
		return (ArrayList<SaleItemModel>)saleItemRepository.findAll();
	}
	
	public SaleItemModel guardarItems(SaleItemModel item) {
		return saleItemRepository.save(item);
	}
	
	public Optional<SaleItemModel> obtenerPorId(Long id){
		return saleItemRepository.findById(id);
	}

}
