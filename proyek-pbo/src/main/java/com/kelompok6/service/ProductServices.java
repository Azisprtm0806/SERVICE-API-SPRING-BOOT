package com.kelompok6.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok6.model.entities.Product;
import com.kelompok6.model.repos.ProductRepo;

@Service
@Transactional
public class ProductServices {

  @Autowired
  private ProductRepo productRepo;

  public Product save(Product product) {
    return productRepo.save(product);
  }

  public Product findOne(Long id) {
    Optional<Product> product = productRepo.findById(id);
    if (!product.isPresent()) {
      return null;
    }
    return product.get();
  }

  public Iterable<Product> findAll() {
    return productRepo.findAll();
  }

  public void removeOne(Long id) {
    productRepo.deleteById(id);
  }

  public List<Product> findByname(String name) {
    return productRepo.findByNameContains(name);
  }
}
