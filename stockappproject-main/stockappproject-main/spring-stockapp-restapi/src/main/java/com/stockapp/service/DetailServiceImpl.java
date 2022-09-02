package com.stockapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.model.Stock;
import com.stockapp.repository.IDetailRepository;

@Service
public class DetailServiceImpl implements IDetailService {

	IDetailRepository detailRepository;
	@Autowired
	public void setDetailRepository(IDetailRepository detailRepository) {
		this.detailRepository = detailRepository;
	}
	
	@Override
	public Stock getByStockType(String stockType) {
		return detailRepository.findByType(stockType);
	}
	@Override
	public Stock getByStockCurrentPrice(double price) {
		return detailRepository.findByCurrentPrice(price);
	}
	
}
