package com.damw.librosapp.service;

import com.damw.librosapp.model.Libro;
import com.damw.librosapp.repository.LibroRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Obtener todos los libros
    public List<Libro> listAll() {
        return libroRepository.findAll();
    }

    // Obtener un libro por ID
    public Optional<Libro> findById(Long id) {
        return libroRepository.findById(id);
    }

    // Crear un nuevo libro
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    // Actualizar un libro existente
    public Optional<Libro> update(Long id, Libro datos) {
        return libroRepository.findById(id).map(libro -> {
            libro.setTitulo(datos.getTitulo());
            libro.setAutor(datos.getAutor());
            libro.setAnioPublicacion(datos.getAnioPublicacion());
            libro.setPrecio(datos.getPrecio());
            libro.setDisponible(datos.isDisponible());
            return libroRepository.save(libro);
        });
    }

    // Eliminar un libro por ID
    public void delete(Long id) {
        libroRepository.deleteById(id);
    }
}