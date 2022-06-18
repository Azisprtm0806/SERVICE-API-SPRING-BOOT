package com.kelompok6.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_konser")
public class Konser implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "nama_konser", length = 100)
  private String namaKonser;

  @Column(name = "deskripsi", length = 500)
  private String deskripsi;

  private double hargaTiket;

  public Konser() {
  }

  public Konser(long id, String namaKonser, String deskripsi, double hargaTiket) {
    this.id = id;
    this.namaKonser = namaKonser;
    this.deskripsi = deskripsi;
    this.hargaTiket = hargaTiket;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNamaKonser() {
    return namaKonser;
  }

  public void setNamaKonser(String namaKonser) {
    this.namaKonser = namaKonser;
  }

  public String getDeskripsi() {
    return deskripsi;
  }

  public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
  }

  public double getHargaTiket() {
    return hargaTiket;
  }

  public void setHargaTiket(double hargaTiket) {
    this.hargaTiket = hargaTiket;
  }

}
