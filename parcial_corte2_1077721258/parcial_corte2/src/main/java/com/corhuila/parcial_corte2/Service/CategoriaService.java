package com.corhuila.parcial_corte2.Service;

import com.corhuila.parcial_corte2.Entity.Categoria;
import com.corhuila.parcial_corte2.Entity.Libro;
import com.corhuila.parcial_corte2.IRepository.ICategoriaRepository;
import com.corhuila.parcial_corte2.IRepository.ILibroRepository;
import com.corhuila.parcial_corte2.IService.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements ICategoriaService {




    @Autowired
    private ICategoriaRepository repository;

    @Override
    public List<Categoria> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public void update(Categoria categoria, Long id) {
        Optional<Categoria> ps =repository.findById(id);
        if(!ps.isEmpty()){
            Categoria categoriaUpdate =ps.get();
            categoriaUpdate.setNombre(categoria.getNombre());
            categoriaUpdate.setCodigo(categoria.getCodigo());
            categoriaUpdate.setLibro(categoria.getLibro());
            repository.save(categoriaUpdate);
        }else{
            System.out.println("No existe el libro");
        }

    }

    @Override
    public void delete(Long id) {
        repository.deleteById( id);
    }
}
