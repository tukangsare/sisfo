package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.Matkul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("matkulRepository")
public interface MatkulRepository extends JpaRepository<Matkul,Long> {
    Matkul findMatkulByname(String name);
}
