package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// Inserting Data 
	
	@Transactional
	public void createProduct(Product product) {

		hibernateTemplate.saveOrUpdate(product);

	}

	
	// Deleting Data
	
	@Transactional
	public void deleteProduct(int productId)
	{
		Product prod = hibernateTemplate.load(Product.class, productId);
		hibernateTemplate.delete(prod);
	}
	
	
	
	// Get Single Data
	
     
		public Product getSingleProduct(int productId) {
			
			return hibernateTemplate.get(Product.class, productId);

		}
	
	
	 

	// Get All Data

	public List<Product> getProducts() {

		List<Product> productList = hibernateTemplate.loadAll(Product.class);

		return productList;

	}

}
