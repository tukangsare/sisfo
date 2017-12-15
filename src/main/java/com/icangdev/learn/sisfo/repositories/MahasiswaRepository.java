package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mahasiswaRepository")
public interface MahasiswaRepository extends JpaRepository<Mahasiswa,Long>{
    Mahasiswa findByNim(String nim);
}
