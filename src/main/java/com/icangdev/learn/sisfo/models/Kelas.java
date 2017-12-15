package com.icangdev.learn.sisfo.models;

import javax.persistence.*;

@Entity
@Table(name = "kelas")
public class Kelas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kelas_id")
    private Integer Id;
    @Column(name = "nama")
    private String nama;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}