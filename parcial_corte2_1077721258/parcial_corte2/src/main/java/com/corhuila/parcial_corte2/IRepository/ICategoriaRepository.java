package com.corhuila.parcial_corte2.IRepository;

import com.corhuila.parcial_corte2.Entity.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository  extends JpaRepository<Categoria, Long> {
}
