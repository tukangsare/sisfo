package com.icangdev.learn.sisfo.models;

import javax.persistence.*;

@Entity
@Table(name = "dosen")
public class Dosen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dosen_id")
    private Integer id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nid;
    private String nama;
    private String alamat;
    private enum Jeniskelamin {
        L,P
    };
    private Jeniskelamin jeniskelamin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Jeniskelamin getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(Jeniskelamin jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
}
