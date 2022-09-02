package com.stockapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.model.Detail;
import com.stockapp.model.Stock;

@Repository
public interface IDetailRepository extends JpaRepository<Detail, Integer> {

	Stock findByType(String stockType);

	Stock findByCurrentPrice(double price);

}
