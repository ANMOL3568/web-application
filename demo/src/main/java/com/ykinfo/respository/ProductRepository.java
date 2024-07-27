/**
 * 
 */
package com.ykinfo.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ykinfo.entity.Product;
/**
 * @author Anmol kumar
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods (if needed) can be defined here
	
}
