package com.corhuila.parcial_corte2.IRepository;

import com.corhuila.parcial_corte2.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibroRepository extends JpaRepository<Libro,Long> {
}
