package services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.SaleModel;
import repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository saleRepository;
	
	public ArrayList<SaleModel> obtenerVentas(){
		return (ArrayList<SaleModel>)saleRepository.findAll();
	}
	
	public SaleModel guardarVenta(SaleModel sale) {
		return saleRepository.save(sale);
	}
	
	public Optional<SaleModel> obtenerPorId(Long id){
		return saleRepository.findById(id);
	}
}
