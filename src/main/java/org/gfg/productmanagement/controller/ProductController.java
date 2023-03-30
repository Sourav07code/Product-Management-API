package org.gfg.productmanagement.controller;

import java.util.List;

import org.gfg.productmanagement.model.Product;
import org.gfg.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
 
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok().body(productService.createProduct(product));
		
	}
	
	@PostMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable long id) throws Exception{
		return ResponseEntity.ok().body(productService.getProductById(id));
		
	}
	
	@GetMapping("/products/")
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok().body(productService.getAllProduct());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
