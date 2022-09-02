package com.stockapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockapp.model.Stock;
import com.stockapp.repository.ITermRepository;

@Service
public class TermServiceImpl implements ITermService {

	
	ITermRepository termRepository;
	@Autowired
	public void setTermRepository(ITermRepository termRepository) {
		this.termRepository = termRepository;
	}
	@Override
	public List<Stock> getByTermName(String termName) {
		return termRepository.findByName(termName);
	}
	
	
	
}
