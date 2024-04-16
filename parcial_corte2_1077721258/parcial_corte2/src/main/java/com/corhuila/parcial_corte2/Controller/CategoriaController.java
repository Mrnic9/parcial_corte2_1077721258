package com.corhuila.parcial_corte2.Controller;

import com.corhuila.parcial_corte2.Entity.Categoria;
import com.corhuila.parcial_corte2.IService.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService service;

    @GetMapping()
    public List<Categoria> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping()
    public Categoria save(@RequestBody Categoria categoria){
        return service.save(categoria);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Categoria categoria, @PathVariable Long id){
        service.update(categoria, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
