package com.stockapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.model.Stock;
import com.stockapp.repository.IStockRepository;

@Service
public class StockServiceImpl implements IStockService {

	IStockRepository stockRepository;
	@Autowired
	public void setStockRepository(IStockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}
	@Override
	public void addStock(Stock stock) {
		
			stockRepository.save(stock);
		
	}
	@Override
	public void updateStock(Stock stock) {
		stockRepository.save(stock);
	}
	@Override
	public void deleteStock(int stockId) {
		stockRepository.deleteById(stockId);
		
	}
	@Override
	public Stock getByStockId(int stockId) {
		return stockRepository.findById(stockId).get();	
		}
	@Override
	public double getByProfit() {
		return stockRepository.findByProfit();
		
	}
	@Override
	public Stock getByStockDetail(int stockId) {
		return stockRepository.findByDetails(stockId).get();
	}
	
}
