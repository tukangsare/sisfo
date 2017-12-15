package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.KBM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("kbmRepository")
public interface KbmRepository extends JpaRepository<KBM,Long> {
}
