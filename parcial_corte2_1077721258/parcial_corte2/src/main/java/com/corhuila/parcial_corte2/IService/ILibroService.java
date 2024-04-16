package com.corhuila.parcial_corte2.IService;

import com.corhuila.parcial_corte2.Entity.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    List<Libro> findAll();
    Optional<Libro> findById(Long id);
    Libro save(Libro libro);
    void update(Libro libro,Long id);
    void delete(Long id);
}
