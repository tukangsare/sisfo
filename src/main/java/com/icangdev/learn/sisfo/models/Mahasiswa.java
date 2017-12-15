package com.icangdev.learn.sisfo.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mahasiswa_id")
    private Long Id;
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Enumerated(EnumType.STRING)
    @Column(name = "jeniskelamin")
    private JenisKelamin jeniskelamin;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "semester")
    private Integer semester;
    @Column(name = "jurusan")
    private Jurusan jurusan;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "kelas_mhs",joinColumns = @JoinColumn(name = "mahasiswa_id"),inverseJoinColumns = @JoinColumn(name = "kelas_id"))
    private Set<Kelas> kelas;
    @OneToMany(mappedBy = "mahasiswa")
    private Set<Nilai> nilai;
    private enum Jurusan {
        TI,
        MI,
        KA
    }
    private enum JenisKelamin {
        Pria,
        Wanita
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public JenisKelamin getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(JenisKelamin jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public Set<Kelas> getKelas() {
        return kelas;
    }

    public void setKelas(Set<Kelas> kelas) {
        this.kelas = kelas;
    }

    public Set<Nilai> getNilai() {
        return nilai;
    }

    public void setNilai(Set<Nilai> nilai) {
        this.nilai = nilai;
    }
}
