package com.kelompok6.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok6.model.entities.Konser;
import com.kelompok6.model.repos.KonserRepo;

@Service
@Transactional
public class KonserServices {

  @Autowired
  private KonserRepo konserRepo;

  public Konser save(Konser konser) {
    return konserRepo.save(konser);
  }

  public Konser findOne(Long id) {
    Optional<Konser> konser = konserRepo.findById(id);
    if (!konser.isPresent()) {
      return null;
    }
    return konser.get();
  }

  public Iterable<Konser> findAll() {
    return konserRepo.findAll();
  }

  public void removeOne(Long id) {
    konserRepo.deleteById(id);
  }

  public List<Konser> findByname(String name) {
    return konserRepo.findByNamaKonser(name);
  }
}
