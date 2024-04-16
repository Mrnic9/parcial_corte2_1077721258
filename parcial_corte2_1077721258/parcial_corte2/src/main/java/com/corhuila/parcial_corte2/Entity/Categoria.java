package com.corhuila.parcial_corte2.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable = false)
    private  String nombre;

    @Column(name="codigo", nullable = false)
    private  String codigo;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "libro_id",nullable = false)
    private Libro libro;

    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
