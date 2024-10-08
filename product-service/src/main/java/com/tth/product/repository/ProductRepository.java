package com.tth.product.repository;

import com.tth.product.entity.Product;
import com.tth.product.repository.specification.ProductSpecification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>, ProductSpecification {
}
