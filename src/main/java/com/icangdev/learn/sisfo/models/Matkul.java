package com.icangdev.learn.sisfo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "matkul")
public class Matkul {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "matkul_id")
    private Long Id;
    @Column(name = "kode_matkul")
    private String kode;
    @Column(name = "nama_matkul")
    private String nama;
    @OneToMany(mappedBy = "matkul")
    private Set<KBM> kbm;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Set<KBM> getKbm() {
        return kbm;
    }

    public void setKbm(Set<KBM> kbm) {
        this.kbm = kbm;
    }
}
