package com.icangdev.learn.sisfo.repositories;

import com.icangdev.learn.sisfo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rolerepository extends JpaRepository<Role,Long> {
    Role findByRole(String role);
}
