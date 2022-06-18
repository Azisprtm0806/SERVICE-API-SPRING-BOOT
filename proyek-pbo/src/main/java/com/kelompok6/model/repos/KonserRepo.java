package com.kelompok6.model.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kelompok6.model.entities.Konser;

public interface KonserRepo extends CrudRepository<Konser, Long> {
  List<Konser> findByNamaKonser(String name);
}
