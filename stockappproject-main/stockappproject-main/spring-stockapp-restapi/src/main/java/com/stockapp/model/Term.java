package com.stockapp.model;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Term {

	@Id
	@GeneratedValue(generator = "term_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "term_gen", initialValue = 1, allocationSize = 1)
	private Integer termId;
	private String termName; // short/long

	@ManyToOne
	@JoinColumn(name = "stock_id") 
	private Stock stock;

	public Term() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Term(String termName) {
		super();
		
		this.termName = termName;
		
	}

	public Integer getTermId() {
		return termId;
	}

	public void setTermId(Integer termId) {
		this.termId = termId;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Term [termName=" + termName + "]";
	}
	
	
	
}
