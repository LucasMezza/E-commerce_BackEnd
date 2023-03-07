package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.PurchaseModel;
import repositories.PurchaseRepository;

@Service
public class PurchaseService {

	@Autowired
	PurchaseRepository purchaseRepository;
	
	public ArrayList<PurchaseModel> obtenerCompras(){
		return (ArrayList<PurchaseModel>)purchaseRepository.findAll();
	}
	
	public PurchaseModel guardarCompra(PurchaseModel purchase) {
		return purchaseRepository.save(purchase);
	}
	
	public Optional<PurchaseModel> obtenerPorId(Long id){
		return purchaseRepository.findById(id);
	}
}
