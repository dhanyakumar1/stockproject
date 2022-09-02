package com.stockapp.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Stock;

@Repository
public interface IStockRepository extends JpaRepository<Stock, Integer> {

	@Query("from Stock s where s.stockId=?1")
	Stock findByDetails(int stockId);

	double findByProfit();

	
}
