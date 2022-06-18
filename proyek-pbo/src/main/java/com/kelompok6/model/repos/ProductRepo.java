package com.kelompok6.model.repos;

import java.util.List;
import com.kelompok6.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {

  List<Product> findByNameContains(String name);

}
