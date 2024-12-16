package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.ProductDao;
import com.model.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;

	
	// Display All Products on Web Page
	
	@RequestMapping("/menus")
	public String menu(Model m) {
		List<Product> products = productDao.getProducts();
		m.addAttribute("productList", products);
		return "menu";
	}
	
	

	// Insert Product into Database 

	@RequestMapping("/add_product")
	public String addProduct(Model m) {

		m.addAttribute("title", "Add Product");

		return "add_product";

	}
	
	
	// Handle Insert Product Form Data

		@RequestMapping(value = "/handle-form", method = RequestMethod.POST)
		public RedirectView handleForm(@ModelAttribute("product") Product product, HttpServletRequest request) {
			

			productDao.createProduct(product);
			
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath() + "/menus");
			return redirectView;

		}

	
	// Delete Product into Database 

		
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request)
	{
		productDao.deleteProduct(productId);
		
		RedirectView redirectView = new RedirectView();

		redirectView.setUrl(request.getContextPath() + "/menus");

		return redirectView;
		
	}
	

	// Update Product into Database 

		@RequestMapping("/update/{productId}")
		public String updateForm(@PathVariable("productId") int productId, Model model) {
			Product productView = productDao.getSingleProduct(productId);
			model.addAttribute("productUpdate", productView);

			return "update_form";

		}
	
	
	
	
	

	 

 

}
