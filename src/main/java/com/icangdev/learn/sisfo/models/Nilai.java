package com.icangdev.learn.sisfo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "nilai")
public class Nilai {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nilai_id")
    private Long Id;
    @Column(name = "nilai_absensi")
    private Integer NilaiAbsensi;
    @Column(name = "nilaitugas")
    private Integer NilaiTugas;
    @Column(name = "nilaiuts")
    private Integer NilaiUts;
    @Column(name = "nilaiuas")
    private Integer NilaiUas;
    @OneToMany(mappedBy = "nilai")
    private Set<Matkul> matkul;
    @ManyToOne
    @JoinColumn(name = "mahasiswa_id",nullable=false)
    private Mahasiswa mahasiswa;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getNilaiAbsensi() {
        return NilaiAbsensi;
    }

    public void setNilaiAbsensi(Integer nilaiAbsensi) {
        NilaiAbsensi = nilaiAbsensi;
    }

    public Integer getNilaiTugas() {
        return NilaiTugas;
    }

    public void setNilaiTugas(Integer nilaiTugas) {
        NilaiTugas = nilaiTugas;
    }

    public Integer getNilaiUts() {
        return NilaiUts;
    }

    public void setNilaiUts(Integer nilaiUts) {
        NilaiUts = nilaiUts;
    }

    public Integer getNilaiUas() {
        return NilaiUas;
    }

    public void setNilaiUas(Integer nilaiUas) {
        NilaiUas = nilaiUas;
    }

    public Set<Matkul> getMatkul() {
        return matkul;
    }

    public void setMatkul(Set<Matkul> matkul) {
        this.matkul = matkul;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}