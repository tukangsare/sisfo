package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.Kelas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("kelasRepository")
public interface KelasRepository extends JpaRepository<Kelas,Integer>{
    Kelas findByName(String name);
}
