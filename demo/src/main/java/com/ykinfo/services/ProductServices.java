/**
 * 
 */
package com.ykinfo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ykinfo.entity.Product;
import com.ykinfo.respository.ProductRepository;

/**
 * @author Anmol kumar
 *
 */
@Service
public class ProductServices {


    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setProdId(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

}
