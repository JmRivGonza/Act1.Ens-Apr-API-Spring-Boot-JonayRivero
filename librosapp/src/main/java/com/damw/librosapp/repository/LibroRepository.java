package com.damw.librosapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.damw.librosapp.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    
}
