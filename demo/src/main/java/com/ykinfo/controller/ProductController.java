/**
 * 
 */
package com.ykinfo.controller;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.tools.Trace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ykinfo.entity.Product;
import com.ykinfo.services.ProductServices;

/**
 * @author Anmol kumar
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired(required = true)
    private  ProductServices productServices;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
    	
		/*
		 * List<Product> products=new ArrayList<>();
		 * products.addAll(productServices.getAllProducts());
		 * System.out.println(" product list "+products);
		 */
    			List<Product> products = productServices.getAllProducts();
    	        return ResponseEntity.ok(products);

    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productServices.getProductById(id).orElse(null);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productServices.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productServices.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
    	productServices.deleteProduct(id);
    }

}
