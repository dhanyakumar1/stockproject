package com.stockapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.model.Buyer;
import com.stockapp.repository.IBuyerRepository;

@Service
public class BuyerServiceImpl implements IBuyerService {

	IBuyerRepository buyerRepository;
	@Autowired
	public void setBuyerRepository(IBuyerRepository buyerRepository) {
		this.buyerRepository = buyerRepository;
	}
	@Override
	public List<Buyer> getByStockName(String stockName) {
		return buyerRepository.findByStockName(stockName);
	}
	
	
}
