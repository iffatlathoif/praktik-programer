package com.tes.praktik.Praktik.Programmer.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pasien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pasien")
    private Integer idPasien;
    @Column(name = "nama_pasien")
    private String namaPasien;
    @Column(name = "jenis_kelamin_pasien")
    private String jenisKelaminPasien;
    @Column(name = "tgl_lahir_pasien")
    private Date tglLahirPasien;
    public Integer getIdPasien() {
        return idPasien;
    }
    public void setIdPasien(Integer idPasien) {
        this.idPasien = idPasien;
    }
    public String getNamaPasien() {
        return namaPasien;
    }
    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }
    public String getJenisKelaminPasien() {
        return jenisKelaminPasien;
    }
    public void setJenisKelaminPasien(String jenisKelaminPasien) {
        this.jenisKelaminPasien = jenisKelaminPasien;
    }
    public Date getTglLahirPasien() {
        return tglLahirPasien;
    }
    public void setTglLahirPasien(Date tglLahirPasien) {
        this.tglLahirPasien = tglLahirPasien;
    }

    
}
