package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.Dosen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("dosenRepository")
public interface DosenRepository extends JpaRepository<Dosen,Long>{
    Dosen findDosenByNid(String nid);
}
