package org.gfg.productmanagement.repository;

import org.gfg.productmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

//	@SuppressWarnings("unchecked")
//	Product save(Product product); // T = Type of object

}
