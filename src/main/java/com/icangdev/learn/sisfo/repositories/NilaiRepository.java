package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.Nilai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("nilaiRepository")
public interface NilaiRepository extends JpaRepository<Nilai,Long>{
    Nilai findNilaiById(Long id);
}
