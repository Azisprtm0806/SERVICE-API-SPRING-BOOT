package com.kelompok6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelompok6.model.entities.Konser;
import com.kelompok6.service.KonserServices;

@RestController
@RequestMapping("api/konser")
public class KonserController {

  @Autowired
  private KonserServices konserServices;

  @PostMapping
  public Konser create(@RequestBody Konser konser) {
    return konserServices.save(konser);
  }

  @GetMapping
  public Iterable<Konser> findAll() {
    return konserServices.findAll();
  }

  @GetMapping("/{id}")
  public Konser findOne(@PathVariable("id") Long id) {
    return konserServices.findOne(id);
  }

  @DeleteMapping("/{id}")
  public void removeOne(@PathVariable("id") Long id) {
    konserServices.removeOne(id);
  }

}
