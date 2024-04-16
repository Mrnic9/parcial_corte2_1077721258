package com.corhuila.parcial_corte2.Service;

import com.corhuila.parcial_corte2.Entity.Libro;
import com.corhuila.parcial_corte2.IRepository.ILibroRepository;
import com.corhuila.parcial_corte2.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.ThreadContext.isEmpty;
@Service
public class LibroService  implements ILibroService {

    @Autowired
    private ILibroRepository repository;


    @Override
    public List<Libro> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Libro> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Libro save(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public void update(Libro libro, Long id) {
        Optional<Libro> ps =repository.findById(id);
        if(!ps.isEmpty()){
            Libro libroUpdate =ps.get();
            libroUpdate.setAutor(libro.getAutor());
            libroUpdate.setTitulo(libro.getTitulo());
            repository.save(libroUpdate);
        }else{
            System.out.println("No existe el libro");
        }

    }

    @Override
    public void delete(Long id) {
     repository.deleteById( id);
    }
}
