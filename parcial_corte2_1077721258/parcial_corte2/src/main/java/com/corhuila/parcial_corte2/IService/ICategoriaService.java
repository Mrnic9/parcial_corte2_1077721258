package com.corhuila.parcial_corte2.IService;

import com.corhuila.parcial_corte2.Entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {
    List<Categoria> findAll();
    Optional<Categoria> findById(Long id);
    Categoria save(Categoria categoria);
    void update(Categoria categoria,Long id);
    void delete(Long id);
}
