package com.icangdev.learn.sisfo.models;

import javax.persistence.*;

@Entity
@Table(name="kbm")
public class KBM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "matkul_id",nullable = false)
    private Matkul matkul;
    @JoinColumn(name = "dosen_id",nullable = false)
    private Dosen dosen;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Matkul getMatkul() {
        return matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
}
